/*
 * Copyright 2023 TopicQuests Foundation
 *  This source code is available under the terms of the Affero General Public License v3.
 *  Please see LICENSE.txt for full license terms, including the availability of proprietary exceptions.
 */
package org.topicquests.newasr.impl;

import org.topicquests.newasr.api.IAddressable;
import org.topicquests.newasr.api.ISimpleTriple;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

/**
 * @author jackpark
 *
 */
public class ASRSimpleTriple implements ISimpleTriple {
	private JsonObject data;
	/**
	 * 
	 */
	public ASRSimpleTriple() {
		data = new JsonObject();
		this.setNormalizedTripleId(-1); // set default
	}
	
	public ASRSimpleTriple(JsonObject d) {
		data = d;
	}

	@Override
	public void setId(long id) {
		data.addProperty(IAddressable.ID_KEY, new Long(id));
	}

	@Override
	public long getId() {
		return data.get(IAddressable.ID_KEY).getAsJsonPrimitive().getAsLong();
	}


	@Override
	public String getSubjectType() {
		return data.get(ISimpleTriple.SUBJ_TYP_KEY).getAsString();
	}

	@Override
	public void setPredicateId(long id) {
		data.addProperty(ISimpleTriple.PRED_KEY, new Long(id));
	}

	@Override
	public long getPredicateId() {
		return data.get(ISimpleTriple.PRED_KEY).getAsJsonPrimitive().getAsLong();
	}




	@Override
	public String getObjectType() {
		return data.get(ISimpleTriple.OBJ_TYP_KEY).getAsString();
	}

	@Override
	public void addSentenceId(long sentenceId) {
		JsonArray sx = listSentenceIds();
		if (sx == null) {
			sx = new JsonArray();
			data.add(ISimpleTriple.SENTENCE_KEY, sx);
		}
		sx.add(new Long(sentenceId));
	}

	@Override
	public JsonArray listSentenceIds() {
		JsonElement je = data.get(ISimpleTriple.SENTENCE_KEY);
		if (je != null)
			return je.getAsJsonArray();
		return null;
	}
/*
	@Override
	public void setPSI(String psi) {
		data.addProperty(ISimpleTriple.PSI_KEY, psi);
	}

	@Override
	public String getPSI() {
		return data.get(ISimpleTriple.PSI_KEY).getAsString();
	}
*/
	@Override
	public void setNormalizedTripleId(long id) {
		data.addProperty(ISimpleTriple.NORMALIZED_ID_KEY, new Long(id));
	}

	@Override
	public long getNormalizedTripleId() {
		return data.get(ISimpleTriple.NORMALIZED_ID_KEY).getAsJsonPrimitive().getAsLong();
	}

	@Override
	public void setSubjectId(long id, String type) {
		data.addProperty(ISimpleTriple.SUBJ_KEY, new Long(id));
		data.addProperty(ISimpleTriple.SUBJ_TYP_KEY, type);
	}

	@Override
	public long getSubjectId() {
		return data.get(ISimpleTriple.SUBJ_KEY).getAsJsonPrimitive().getAsLong();
	}

	@Override
	public void setObjectId(long id, String type) {
		data.addProperty(ISimpleTriple.OBJ_KEY, new Long(id));
		data.addProperty(ISimpleTriple.OBJ_TYP_KEY, type);
	}

	@Override
	public long getObjectId() {
		return data.get(ISimpleTriple.OBJ_KEY).getAsJsonPrimitive().getAsLong();
	}

	@Override
	public JsonObject getData() {
		return data;
	}

	@Override
	public void setSubjectText(String text) {
		data.addProperty(ISimpleTriple.SUBJ_TXT_KEY, text);
	}

	@Override
	public String getSubjectText() {
		return data.get(ISimpleTriple.SUBJ_TXT_KEY).getAsString();
	}

	@Override
	public void setPredicateText(String text) {
		data.addProperty(ISimpleTriple.PRED_TXT_KEY, text);
	}

	@Override
	public String getPredicateText() {
		return data.get(ISimpleTriple.PRED_TXT_KEY).getAsString();
	}

	@Override
	public void setObjectText(String text) {
		data.addProperty(ISimpleTriple.OBJ_TXT_KEY, text);
	}

	@Override
	public String getObjectText() {
		return data.get(ISimpleTriple.OBJ_TXT_KEY).getAsString();
	}
}
