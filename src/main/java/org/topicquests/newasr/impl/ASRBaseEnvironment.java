/**
 * 
 */
package org.topicquests.newasr.impl;

import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.topicquests.newasr.api.IASREnvironment;
import org.topicquests.newasr.util.Configurator;

/**
 * @author jackpark
 *
 */
public abstract class ASRBaseEnvironment implements IASREnvironment {
	private final Logger LOG;
	private Map<String, Object> properties;
	private Map<String, Object> kafkaProperties = null;

	/**
	 * 
	 * @param propertyPath
	 * @param kafkaPropetyPath  can be {@code null}
	 * @param loggerPath
	 */
	public ASRBaseEnvironment(String propertyPath, String kafkaPropetyPath, String loggerPath) {
		System.setProperty("log4j2.configurationFile", loggerPath);
		LOG = LoggerFactory.getLogger(ASRBaseEnvironment.class);
		properties = Configurator.getProperties(propertyPath);
		if (kafkaPropetyPath != null)
			kafkaProperties = Configurator.getProperties(kafkaPropetyPath);


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
