/*
 * Copyright 2023 TopicQuests Foundation
 *  This source code is available under the terms of the Affero General Public License v3.
 *  Please see LICENSE.txt for full license terms, including the availability of proprietary exceptions.
 */
package org.topicquests.newasr.api;

import com.google.gson.JsonArray;

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
		PRED_KEY			= "pred",
		OBJ_KEY				= "obj",
		OBJ_TYP_KEY			= "objT",
		PSI_KEY				= "psi",
		NORMALIZED_ID_KEY	= "norm",
		SENTENCE_KEY		= "sent";
	
	/**
	 * 
	 * @param id
	 * @param type can not be {@code null}
	 */
	void setSubjectId(long id, String type);
	
	/**
	 * Must use object type to cast result
	 * @return
	 */
	long getSubjectId();
	String getSubjectType()
;	
	void setPredicateId(long id);
	long getPredicateId();
	
;	void setObjectId(long id, String type);
	//Object getObject();
	long getObjectId();
	String getObjectType();
	
	void addSentenceId(long sentenceId);
	JsonArray listSentenceIds();
	
	void setPSI(String psi);
	String getPSI();
	
	void setNormalizedTripleId(long id);
	/**
	 * Can return {@code -1}
	 * @return
	 */
	long getNormalizedTripleId();
	
	void computePSI();

}
