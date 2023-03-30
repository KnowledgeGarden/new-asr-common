/*
 * Copyright 2023 TopicQuests Foundation
 *  This source code is available under the terms of the Affero General Public License v3.
 *  Please see LICENSE.txt for full license terms, including the availability of proprietary exceptions.
 */

package org.topicquests.newasr.api;

import com.google.gson.JsonObject;

/**
 * @author jackpark
 *
 */
public interface IDocument extends IAddressable {

	/**
	 * Metadata about a publication
	 * @param pub
	 */
	void setPublicationMetadata(IPublication pub);
	
	/**
	 * @feturn can return {@code null)
	 */
	IPublication getPublicationMetadata();
	
	void setAbstract(String text);
	
	/**
	 * Can return {@code null}
	 * @return
	 */
	String getAbstract();
	
	void setBody(String text);
	
	/**
	 * Can return {@code null}
	 * @return
	 */
	String getBody();
	
	JsonObject getData();

}
