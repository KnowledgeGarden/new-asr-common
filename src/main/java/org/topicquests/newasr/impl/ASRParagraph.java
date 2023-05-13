/*
 * Copyright 2023 TopicQuests Foundation
 *  This source code is available under the terms of the Affero General Public License v3.
 *  Please see LICENSE.txt for full license terms, including the availability of proprietary exceptions.
 */

package org.topicquests.newasr.impl;

import org.topicquests.newasr.api.IConstants;
import org.topicquests.newasr.api.IParagraph;
import org.topicquests.newasr.api.ISentence;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

/**
 * @author jackpark
 *
 */
public class ASRParagraph implements IParagraph {
	private JsonObject data;

	/**
	 * 
	 */
	public ASRParagraph() {
		data = new JsonObject();
		//defaults
		setDocumentId(-1);
	}
	
	public ASRParagraph(JsonObject d) {
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
	public void setDocumentId(long id) {
		data.addProperty(ISentence.DOCUMENT_ID, new Long(id));
	}

	@Override
	public long getDocumentId() {
		return data.get(ISentence.DOCUMENT_ID).getAsLong();
	}

	@Override
	public void setText(String text) {
		data.addProperty(ISentence.TEXT_FIELD, text);
	}

	@Override
	public String getText() {
		return data.get(ISentence.TEXT_FIELD).getAsString();
	}

	@Override
	public void addSentenceId(long id) {
		JsonElement je = data.get(IParagraph.SENTENCE_ID_FIELD);
		JsonArray ja = null;
		if (je == null) {
			ja = new JsonArray();
			data.add(IParagraph.SENTENCE_ID_FIELD, ja);
		} else {
			ja =je.getAsJsonArray();
		}
		ja.add(new Long(id));
	}

	@Override
	public void setSentenceIds(JsonArray ids) {
		data.add(IParagraph.SENTENCE_ID_FIELD, ids);
	}

	@Override
	public JsonArray getSentenceIds() {
		JsonElement je = data.get(IParagraph.SENTENCE_ID_FIELD);
		if (je == null)
			return null;
		return je.getAsJsonArray();
	}

	@Override
	public void setParagraphConcepts(JsonArray concepts) {
		data.add(IParagraph.CONCEPTS_FIELD, concepts);
	}

	@Override
	public JsonArray getParagraphConcepts() {
		JsonElement je = data.get(IParagraph.CONCEPTS_FIELD);
		if (je == null)
			return null;
		return je.getAsJsonArray();
	}
	@Override
	public JsonObject getData() {
		return data;
	}


}
