/*
 * Copyright 2023 TopicQuests Foundation
 *  This source code is available under the terms of the Affero General Public License v3.
 *  Please see LICENSE.txt for full license terms, including the availability of proprietary exceptions.
 */
package org.topicquests.newasr.impl;

import java.util.List;

import org.topicquests.newasr.api.IAuthor;

import com.google.gson.JsonObject;

/**
 * @author jackpark
 *
 */
public class AuthorPojo implements IAuthor {
	private JsonObject data;

	/**
	 * 
	 */
	public AuthorPojo() {
		data = new JsonObject();
	}


	public AuthorPojo(JsonObject d) {
		data = d;
	}
@Override
	public void setId(String id) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setAuthorLocator(String locator) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getAuthorLocator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setAuthorTitle(String title) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getAuthorTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setAuthorFullName(String fullName) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getAuthorFullName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addAuthorFirstName(String firstName) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<String> listAuthorFirstNames() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setAuthorMiddleName(String middleName) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getAuthorMiddleName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setAuthorLastName(String lastName) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getAuthorLastName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setAuthorSuffix(String t) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getAuthorSuffix() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setAuthorDegree(String deg) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getAuthorDegree() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setAuthorInitials(String initials) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getInitials() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setAuthorNickName(String name) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getAuthorNickName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setAuthorEmail(String email) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getAuthorEmail() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addAffiliationName(String name) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<String> listAffiliationNames() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setAffiliationLocator(String locator) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getAffiliationLocator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDocumentId(String id) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getDocumentId(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDocumentTitle(String title) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getDocumentTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPublisherName(String name) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getPublisherName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPublisherLocator(String locator) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getPublisherLocator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPublicationName(String name) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getPublicationName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPublicationLocator(String locator) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getPublicationLocator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JsonObject getData() {
		return data;
	}

}
