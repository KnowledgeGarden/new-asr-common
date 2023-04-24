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
public interface ITripleModel {

	IResult putTriple(ISimpleTriple t);
	
	IResult getTriple(long tripleId);
	
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
