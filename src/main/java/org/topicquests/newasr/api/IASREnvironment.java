/*
 * Copyright 2023 TopicQuests Foundation
 *  This source code is available under the terms of the Affero General Public License v3.
 *  Please see LICENSE.txt for full license terms, including the availability of proprietary exceptions.
 */
package org.topicquests.newasr.api;
import java.util.Map;

import org.topicquests.support.api.IEnvironment;
/**
 * @author jackpark
 *
 */
public interface IASREnvironment extends IEnvironment {

	
	
	//////////
	// Utilities
	//////////
	
	Map<String, Object> getProperties();
	
	/**
	 * Can return @code null
	 * @return
	 */
	Map<String, Object> getKafkaProperties();
	
	String getStringProperty(String key);

	/**
	 * Can return @code null
	 * @return
	 */
	String getKafkaProperty(String key);

	void shutDown();
	
	void logDebug(String message);
	
	void logError(String message, Exception e);
	
}
