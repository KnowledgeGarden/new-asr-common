/*
 * Copyright 2023 TopicQuests Foundation
 *  This source code is available under the terms of the Affero General Public License v3.
 *  Please see LICENSE.txt for full license terms, including the availability of proprietary exceptions.
 */
package org.topicquests.newasr.api;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

/**
 * @author jackpark
 *
 */
public interface ISimpleTriple extends IAddressable {
	public static final String
		WORDGRAM_TYPE		= "wgt",
		TRIPLE_TYPE			= "tplt";
	public static final String
		SUBJ_KEY			= "subj",
		SUBJ_TYP_KEY		= "subjT",
		SUBJ_TXT_KEY		= "subjTX",
		PRED_KEY			= "pred",
		PRED_TXT_KEY		= "predTX",
		OBJ_KEY				= "obj",
		OBJ_TYP_KEY			= "objT",
		OBJ_TXT_KEY			= "OBJTX",
		PSI_KEY				= "psi",
		NORMALIZED_ID_KEY	= "norm",
		SENTENCE_KEY		= "sent";
	
	/**
	 * 
	 * @param id
	 * @param type can not be {@code null}
	 */
	void setSubjectId(long id, String type);
	void setSubjectText(String text);
	String getSubjectText();
	/**
	 * Must use object type to cast result
	 * @return
	 */
	long getSubjectId();
	String getSubjectType()
;	
	void setPredicateId(long id);
	long getPredicateId();
	void setPredicateText(String text);
	String getPredicateText();
	
;	void setObjectId(long id, String type);
	void setObjectText(String text);
	String getObjectText();
	//Object getObject();
	long getObjectId();
	String getObjectType();
	
	void addSentenceId(long sentenceId);
	JsonArray listSentenceIds();
	
	//void setPSI(String psi);
	//String getPSI();
	
	void setNormalizedTripleId(long id);
	/**
	 * Can return {@code -1}
	 * @return
	 */
	long getNormalizedTripleId();
	
	//void computePSI();
	
	JsonObject getData();

}
