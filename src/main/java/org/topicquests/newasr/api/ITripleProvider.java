/*
 * Copyright 2023 TopicQuests Foundation
 *  This source code is available under the terms of the Affero General Public License v3.
 *  Please see LICENSE.txt for full license terms, including the availability of proprietary exceptions.
 */
package org.topicquests.newasr.api;

import org.topicquests.support.api.IResult;

/**
 * @author jackpark
 *
 */
public interface ITripleProvider {

	////////////////////////
	// Triples are fully normalized WorkingTriples
	// 
	///////////////////////
	IResult putTriple(ISimpleTriple t);
	
	IResult getTriple(long tripleId);
	
	/**
	 * <p>When a new triple is formed, use it as a template to see if it exists
	 * as a Triple in the database. If not, it may exist in WorkingTriples.
	 * If not, the process is to see if it needs normalization.</p>
	 * <p>If it needs normalization, then it is stored as a WorkingTriple first,
	 * then normalized and stored as a Triple, with the normalized working triple updated</p>
	 * 
	 * @param templae
	 * @return
	 */
	IResult getThisTriple(ISimpleTriple templae);
	
	IResult addSentenceToTriple(long tripleId, long sentenceId);
	
	IResult listTripleIds();
	
	IResult listTriplesBySentenceId(long sentenceId);

	IResult putWorkingTriple(ISimpleTriple t);
	
	/**
	 * Can return null if this {@code template does not exist}
	 * @param template
	 * @return
	 */
	IResult getThisWorkingTriple(ISimpleTriple template);
	
	IResult updateWorkingTriple(ISimpleTriple template, long normalTripleId);
}
