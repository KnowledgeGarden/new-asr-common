/**
 * 
 */
package org.topicquests.newasr.impl;

import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.topicquests.newasr.api.IASREnvironment;

/**
 * @author jackpark
 *
 */
public abstract class ASRBaseEnvironment implements IASREnvironment {
	private final Logger LOG;
	private Map<String, Object> properties;
	private Map<String, Object> kafkaProperties;

	/**
	 * 
	 * @param propertyPath
	 * @param kafkaPropetyPath  can be {@code null}
	 * @param loggerPath
	 */
	public ASRBaseEnvironment(String propertyPath, String kafkaPropetyPath, String loggerPath) {
		System.setProperty("log4j2.configurationFile", loggerPath);
		LOG = LoggerFactory.getLogger(ASRBaseEnvironment.class);
	}

	@Override
	public Map<String, Object> getProperties() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> getKafkaProperties() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getStringProperty(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getKafkaProperty(String key) {
		// TODO Auto-generated method stub
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
