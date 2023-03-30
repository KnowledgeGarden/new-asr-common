/*
 * Copyright 2023 TopicQuests Foundation
 *  This source code is available under the terms of the Affero General Public License v3.
 *  Please see LICENSE.txt for full license terms, including the availability of proprietary exceptions.
 */
package org.topicquests.newasr.impl;

import org.topicquests.newasr.api.IGrant;

import com.google.gson.JsonObject;

/**
 * @author jackpark
 *
 */
public class GrantPojo implements IGrant {
	private JsonObject data;

	/**
	 * 
	 */
	public GrantPojo() {
		data = new JsonObject();
	}

	public GrantPojo(JsonObject d) {
		data = d;
	}

	@Override
	public void setGrantId(String id) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getGrantId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setAgency(String agency) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getAgency() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setCountry(String country) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getCountry() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JsonObject getData() {
		return data;
	}

}
