/*
 * Copyright 2023 TopicQuests Foundation
 *  This source code is available under the terms of the Affero General Public License v3.
 *  Please see LICENSE.txt for full license terms, including the availability of proprietary exceptions.
 */
package org.topicquests.newasr.impl;

import java.util.List;

import org.topicquests.newasr.api.IGrant;
import org.topicquests.newasr.api.IPublication;

import com.google.gson.JsonObject;

/**
 * @author jackpark
 *
 */
public class PublicationPojo implements IPublication {
	private JsonObject data;
	/**
	 * 
	 */
	public PublicationPojo() {
		data = new JsonObject();
	}

	public PublicationPojo(JsonObject d) {
		data = d;
	}
	@Override
	public void setTitle(String title) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setCopyright(String c) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getCopyright() {
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
	public void setPublicationDate(String date) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getPublicationDate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPublicationYear(String year) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getPublicationYear() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPubicationVolume(String volume) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getPublicationVolume() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPublicationNumber(String number) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getPublicationNumber() {
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
	public void setPages(String pages) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getPages() {
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
	public void setPublisherLocation(String location) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getPublisherLocation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDOI(String doi) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getDOI() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setISSN(String issn) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getISSN() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setISBN(String isbn) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getISBN() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPublicationType(String type) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getPublicationType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setISOAbbreviation(String abbrev) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getISOAbbreviation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDocumentLocator(String locator) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getDocumentLocator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addGrant(IGrant g) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<IGrant> listGrants() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setMonth(String month) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getMonth() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JsonObject getData() {
		return data;
	}

}
