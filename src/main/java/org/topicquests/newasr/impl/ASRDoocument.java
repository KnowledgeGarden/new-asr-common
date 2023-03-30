/*
 * Copyright 2023 TopicQuests Foundation
 *  This source code is available under the terms of the Affero General Public License v3.
 *  Please see LICENSE.txt for full license terms, including the availability of proprietary exceptions.
 */

package org.topicquests.newasr.impl;

import org.topicquests.newasr.api.IDocument;
import org.topicquests.newasr.api.IPublication;

import com.google.gson.JsonObject;

/**
 * @author jackpark
 *
 */
public class ASRDoocument implements IDocument {
	private JsonObject data;

	/**
	 * 
	 */
	public ASRDoocument() {
		data = new JsonObject();
	}

	public ASRDoocument(JsonObject d) {
		data = d;
	}

	@Override
	public void setId(long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public long getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setPublicationMetadata(IPublication pub) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public IPublication getPublicationMetadata() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setAbstract(String text) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getAbstract() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setBody(String text) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getBody() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JsonObject getData() {
		return data;
	}

}
