/*
 * Copyright 2023 TopicQuests Foundation
 *  This source code is available under the terms of the Affero General Public License v3.
 *  Please see LICENSE.txt for full license terms, including the availability of proprietary exceptions.
 */

package org.topicquests.newasr.impl;

import org.topicquests.newasr.api.IConstants;
import org.topicquests.newasr.api.ISentence;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

/**
 * @author jackpark
 *
 */
public class ASRSentence implements ISentence {
	private JsonObject data;
	/**
	 * 
	 */
	public ASRSentence() {
		data = new JsonObject();
		//defaults
		setParagraphId(-1);
		setDocumentId(-1);
	}

	public ASRSentence(JsonObject json) {
		data = json;
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
	public void setParagraphId(long id) {
		data.addProperty(ISentence.PARAGRAPH_ID, new Long(id));
	}

	@Override
	public long getParagraphId() {
		return data.get(ISentence.PARAGRAPH_ID).getAsLong();
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
	public void setPredicatePhrases(JsonArray preds) {
		data.add(ISentence.PRED_FIELD, preds);
	}

	@Override
	public JsonArray getPredicatePhrases() {
		JsonElement je = data.get(ISentence.PRED_FIELD);
		if (je != null)
			return je.getAsJsonArray();
		return null;
	}

	@Override
	public JsonObject getData() {
		return data;
	}

	@Override
	public void setSpacyData(JsonArray spacyJson) {
		data.add(ISentence.SPACY_FiELD, spacyJson);
	}

	@Override
	public JsonArray getSpacyData() {
		JsonElement je = data.get(ISentence.SPACY_FiELD);
		if (je != null)
			return je.getAsJsonArray();
		return null;
	}

	@Override
	public void setWikiData(JsonArray wikidata) {
		data.add(ISentence.WD_FIELD, wikidata);
	}

	@Override
	public JsonArray getWikiData() {
		JsonElement je = data.get(ISentence.WD_FIELD);
		if (je != null)
			return je.getAsJsonArray();
		return null;
	}

	@Override
	public void setDBpediaData(JsonArray dbpedia) {
		data.add(ISentence.DBP_FIELD, dbpedia);
	}

	@Override
	public JsonArray getDBpediaData() {
		JsonElement je = data.get(ISentence.DBP_FIELD);
		if (je != null)
			return je.getAsJsonArray();
		return null;
	}

	@Override
	public void setNoun(JsonArray noun) {
		data.add(ISentence.NOUN_FIELD, noun);
	}

	@Override
	public JsonArray getNouns() {
		JsonElement je = data.get(ISentence.NOUN_FIELD);
		if (je != null)
			return je.getAsJsonArray();
		return null;
	}

	@Override
	public void setProperNoun(JsonArray noun) {
		data.add(ISentence.PNOUN_FIELD, noun);
	}

	@Override
	public JsonArray getProperNouns() {
		JsonElement je = data.get(ISentence.PNOUN_FIELD);
		if (je != null)
			return je.getAsJsonArray();
		return null;
	}
	@Override
	public void setResolvedNouns(JsonArray nouns) {
		data.add(ISentence.RESNOUN_FIELD, nouns);
	}

	@Override
	public JsonArray getResolvedNouns() {
		JsonElement je = data.get(ISentence.RESNOUN_FIELD);
		if (je != null)
			return je.getAsJsonArray();
		return null;
	}

	@Override
	public void setVerb(JsonArray verb) {
		data.add(ISentence.VERB_FIELD, verb);
	}

	@Override
	public JsonArray getVerbs() {
		JsonElement je = data.get(ISentence.VERB_FIELD);
		if (je != null)
			return je.getAsJsonArray();
		return null;
	}

	@Override
	public void addSimpleTriple(JsonObject trip) {
		JsonArray trips = getSimpleTriples();
		if (trips == null) {
			trips = new JsonArray();
			setSimpleTriples(trips);
		}
		trips.add(trip);
	}

	@Override
	public void setSimpleTriples(JsonArray triples) {
		data.add(ISentence.TRIPLE_FIELD, triples);
	}

	@Override
	public JsonArray getSimpleTriples() {
		JsonElement je = data.get(ISentence.TRIPLE_FIELD);
		if (je != null)
			return je.getAsJsonArray();
		return null;
	}

	@Override
	public void addConjunct(JsonObject conj) {
		JsonArray cons = getConjuncts();
		if (cons == null) {
			cons = new JsonArray();
			setConjuncts(cons);
		}
		cons.add(conj);
	}

	@Override
	public void setConjuncts(JsonArray conjs) {
		data.add(ISentence.CONJUNCT_FIELD, conjs);
	}

	@Override
	public JsonArray getConjuncts() {
		JsonElement je = data.get(ISentence.CONJUNCT_FIELD);
		if (je != null)
			return je.getAsJsonArray();
		return null;	
	}

	@Override
	public void addDisjunct(JsonObject disj) {
		JsonArray dis = getDisjuncts();
		if (dis == null) {
			dis = new JsonArray();
			setDisjuncts(dis);
		}
		dis.add(disj);
	}

	@Override
	public void setDisjuncts(JsonArray disjs) {
		data.add(ISentence.DISJUNCT_FIELD, disjs);
	}

	@Override
	public JsonArray getDisjuncts() {
		JsonElement je = data.get(ISentence.DISJUNCT_FIELD);
		if (je != null)
			return je.getAsJsonArray();
		return null;	
	}

	@Override
	public boolean hasDisjuncts() {
		JsonArray ja = this.getDisjuncts();
		return (ja != null && !ja.isEmpty());
	}

	@Override
	public boolean hasConjuncts() {
		JsonArray ja = this.getConjuncts();
		return (ja != null && !ja.isEmpty());
	}

	@Override
	public void addNominalPhrae(JsonObject nom) {
		JsonArray dis = getNominalPhrases();
		if (dis == null) {
			dis = new JsonArray();
			setNominalPhrases(dis);
		}
		dis.add(nom);
	}

	@Override
	public void setNominalPhrases(JsonArray noms) {
		data.add(ISentence.NOMINAL_FIELD, noms);
	}

	@Override
	public JsonArray getNominalPhrases() {
		JsonElement je = data.get(ISentence.NOMINAL_FIELD);
		if (je != null)
			return je.getAsJsonArray();
		return null;	
	}

	@Override
	public boolean hasNominals() {
		JsonArray ja = this.getNominalPhrases();
		return (ja != null && !ja.isEmpty());
	}

	

}
