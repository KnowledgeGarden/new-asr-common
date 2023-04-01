/*
 * Copyright 2023 TopicQuests Foundation
 *  This source code is available under the terms of the Affero General Public License v3.
 *  Please see LICENSE.txt for full license terms, including the availability of proprietary exceptions.
 */
package org.topicquests.newasr.api;

/**
 * 
 * @author jackpark
 *
 */
public interface ITripleQuery {

	public static final String PUT_TRIPLE =
			"INSERT INTO public.triple (subj_id, pred_id, obj_id, subj_typ, obj_typ) "
			+ "VALUES (?, ?, ?, ?, ?) RETURNS id";
	
	/**
	 * For initial insert and for later adding sentences
	 */
	public static final String PUT_SENTENCES =
			"InSERT INTO public.sentence (id, sentence_id) VALUES(?, ?)";
	
	public static final String GET_TRIPLE_BY_ID =
			"SELECT * FROM public.triple WHHERE id=? ";
	
	public static final String GET_SENTENCES_BY_ID =
			"SELECT sentence_id FROM public.sentences WHERE id=?";
	
	public static final String GET_TRIPLES_BY_SENTENCE_ID =
			"SELECT * FROM public.triple WHERE id = (SELECT id FROM public.sentences WHERE sentence_id=?";
	
	public static final String GET_THIS_TRIPLE =
			"SELECT * FROM public.triple WHERE subj_id=? AND pred_id=? AND obj_id=? AND subj_typ=? AND obj_typ=?";
	
	public static final String LIST_TRIPLE_IDs =
			"SELECT id FROM public.triple";
	
		
}
