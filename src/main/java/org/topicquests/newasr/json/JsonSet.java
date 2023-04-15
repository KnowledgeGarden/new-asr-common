/*
 * Copyright 2023 TopicQuests Foundation
 *  This source code is available under the terms of the Affero General Public License v3.
 *  Please see LICENSE.txt for full license terms, including the availability of proprietary exceptions.
 */
package org.topicquests.newasr.json;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

/**
 * @author jackpark
 * <p>This is basically an {@link JsonArray which behaves as if is
 * a {@link java.util.Set} and with one custom API which satisfies 
 * a particular need in the ASR ecosystem</p>
 * <p> Its Behavior:<br/>
 * When comparing text fields, it will look for containment of a short
 * text within a longer one.<br/>
 * If a short field is already in the set, it will block the longer one,
 * meaning, if that's important, one should present it with longer fields first</p>
 */
public class JsonSet {
	private JsonArray data;
	private final int DISTANCE = 3;
	/**
	 * 
	 */
	public JsonSet() {
	}

	public JsonSet(JsonArray d) {
		data = d;
	}

	/**
	 * Start a fresh set
	 */
	public void newSet() {
		data = new JsonArray();
	}
	
	/**
	 * Simple set-based add
	 * @param value
	 */
	public void add(JsonObject value) {
		if (!data.contains(value))
			data.add(value);
	}
	
	/**
	 * <p>Special set-based add for structures which look like this<br/>
	 * {"strt":1, "txt":"some text"}</p>
	 * <p>{@code strt} is a position. We need to allow positional equality to be within
	 * a small distance, not strict equality</p>
	 * @param value
	 */
	public void addTriple(JsonObject value) {
		int len = data.size();
		JsonObject jo;
		String valueText = value.get("txt").getAsString();
		String text;
		int valueWhere = value.get("strt").getAsJsonPrimitive().getAsInt();
		int where;
		boolean isFound = false;
		for (int i=0;i<len;i++ ) {
			jo = data.get(i).getAsJsonObject();
			text = jo.get("txt").getAsString();
			where = jo.get("strt").getAsJsonPrimitive().getAsInt();
			if (isEquivalent(valueWhere, where) &&
				isEquivalent(valueText, text)) {
				isFound = true;
				break;
			}
		}
		if (!isFound)
			data.add(value);
	}
	
	boolean isEquivalent(String valueText, String text) {
		String foo = valueText.toLowerCase();
		String bar = text.toLowerCase();
		if (foo.equals(bar))
			return true;
		if (foo.contains(bar))
			return true;
		if (bar.contains(foo))
			return true;
		return false;
	}
	boolean isEquivalent(int valueWhere, int where) {
		System.out.println("IEQ "+valueWhere+" "+where);
		if (valueWhere ==where)
			return true;
		int diff = 0;
		if (valueWhere > where)
			diff = valueWhere - where;
		else
			diff = where - valueWhere;
		System.out.println("IEQ-1 "+diff);
		return (diff <= DISTANCE);
	}
	
	public JsonArray getData() {
		return data;
	}
}
