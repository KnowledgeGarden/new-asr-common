/*
 * Copyright 2023 TopicQuests Foundation
 *  This source code is available under the terms of the Affero General Public License v3.
 *  Please see LICENSE.txt for full license terms, including the availability of proprietary exceptions.
 */

package org.topicquests.newasr.util;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

/**
 * @author jackpark
 *
 */
public class JsonUtil {

	/**
	 * 
	 */
	public JsonUtil() {
	}

	/**
	 * 
	 * @param jsonString
	 * @return
	 * @throws Exception
	 */
	public JsonObject parse(final String jsonString) throws Exception {
		return (JsonObject)JsonParser.parseString(jsonString);
	}

}
