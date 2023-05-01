/*
 * Copyright 2023 TopicQuests Foundation
 *  This source code is available under the terms of the Affero General Public License v3.
 *  Please see LICENSE.txt for full license terms, including the availability of proprietary exceptions.
 */

package org.topicquests.newasr.impl;

import org.topicquests.newasr.api.IAuthor;
import org.topicquests.newasr.api.IConstants;
import org.topicquests.newasr.api.IDocument;
import org.topicquests.newasr.api.IPublication;
import org.topicquests.newasr.api.ISentence;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
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
		data.addProperty(IConstants.ID_KEY, new Long(id));
	}

	@Override
	public long getId() {
		return data.get(IConstants.ID_KEY).getAsLong();
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
		data.addProperty(IDocument.ABSTRACT_KEY, text);
	}

	@Override
	public String getAbstract() {
		JsonElement je = data.get(IDocument.ABSTRACT_KEY);
		if (je != null)
			return je.getAsString();
		return null;
	}

	@Override
	public void setBody(String text) {
		data.addProperty(IDocument.BODY_KEY, text);
	}

	@Override
	public String getBody() {
		JsonElement je = data.get(IDocument.BODY_KEY);
		if (je != null)
			return je.getAsString();
		return null;
	}

	@Override
	public JsonObject getData() {
		return data;
	}

	@Override
	public void addAuthor(IAuthor author) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setAuthors(JsonArray authors) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeAuthor(IAuthor author) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public JsonArray getAuthors() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setType(String t) {
		data.addProperty(IDocument.TYPE_KEY, t);
	}

	@Override
	public String getType() {
		JsonElement je = data.get(IDocument.TYPE_KEY);
		if (je != null)
			return je.getAsString();
		return null;
	}

}
