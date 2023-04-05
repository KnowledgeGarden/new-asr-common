/*
 * Copyright 2023 TopicQuests Foundation
 *  This source code is available under the terms of the Affero General Public License v3.
 *  Please see LICENSE.txt for full license terms, including the availability of proprietary exceptions.
 */
package org.topicquests.newasr.impl;

import java.util.Map;
import java.util.Properties;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.topicquests.newasr.api.IASREnvironment;
import org.topicquests.newasr.api.IExpectationTypes;
import org.topicquests.newasr.kafka.CommonKafkaProducer;
import org.topicquests.newasr.util.ConfigurationHelper;
import org.topicquests.newasr.util.Configurator;

import com.google.gson.JsonObject;


/**
 * @author jackpark
 *
 */
public abstract class ASRBaseEnvironment implements IASREnvironment {
	private final Logger LOG;
	private Map<String, Object> properties;
	private Map<String, Object> kafkaProperties = null;
	private CommonKafkaProducer kafkaProducer;
	private ConfigurationHelper configPathHelper;
	public static final String AGENT_GROUP = "ASRGroup";
	private final String EXPECTATION_TOPIC, SENTENCE_KEY;
	private final Integer partition;

	/**
	 * 
	 * @param propertyPath
	 * @param kafkaPropetyPath  can be {@code null}
	 * @param loggerPath
	 */
	public ASRBaseEnvironment(String propertyPath, String loggerPath) {
		configPathHelper = new ConfigurationHelper();
		//Properties props = System.getProperties();

		//props.setProperty("log4j2.configurationFile", configPathHelper.findPath(loggerPath));
		LOG = LogManager.getLogger(ASRBaseEnvironment.class);
		properties = Configurator.getProperties(propertyPath);
		kafkaProperties = Configurator.getProperties("kafka-topics.xml");
		EXPECTATION_TOPIC = getKafkaProperty("ExpectationFailureTopic");
		SENTENCE_KEY = "data"; 		//TODO FIXME
		partition = new Integer(0);	//TODO FiXME


		kafkaProducer = new CommonKafkaProducer(this, AGENT_GROUP);

	}
	
	public CommonKafkaProducer getSentenceProducer() {
		return kafkaProducer;
	}

	/**
	 * General purpose expectation event creation
	 * @param type -- the expectation type @see {@link IExpectationTypes}
	 * @param cargo
	 */
	public void sendExpectationFailureEvent(String type, String cargo) {
		JsonObject jo = new JsonObject();
		jo.addProperty("type", type);
		jo.addProperty("cargo", cargo);
		kafkaProducer.sendMessage(EXPECTATION_TOPIC, jo.toString(), SENTENCE_KEY, partition);
	}


	@Override
	public Map<String, Object> getProperties() {
		return properties;
	}

	@Override
	public Map<String, Object> getKafkaProperties() {
		return kafkaProperties;
	}

	@Override
	public String getStringProperty(String key) {
		return (String)properties.get(key);
	}

	@Override
	public String getKafkaProperty(String key) {
		if (kafkaProperties != null)
			return (String)kafkaProperties.get(key);
		return null;
	}

	@Override
	public abstract void shutDown();

	@Override
	public void logDebug(String message) {
		LOG.debug(message);
	}

	@Override
	public void logError(String message, Exception e) {
		LOG.error(message, e);
	}


}
