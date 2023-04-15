/*
 * Copyright 2023 TopicQuests Foundation
 *  This source code is available under the terms of the Affero General Public License v3.
 *  Please see LICENSE.txt for full license terms, including the availability of proprietary exceptions.
 */
package org.topicquests.newasr.test;

import org.topicquests.newasr.json.JsonSet;

import com.google.gson.JsonObject;
import com.google.gson.JsonArray;


/**
 * @author jackpark
 *
 */
public class JsonSetTest {
	private JsonSet set;
	/**
	 * 
	 */
	public JsonSetTest() {
		set = new JsonSet();
		set.newSet();
		JsonObject foo = new JsonObject();
		foo.addProperty("txt","foo");
		JsonObject bar = new JsonObject();
		bar.addProperty("txt","bar");
		JsonObject bah = new JsonObject();
		bah.addProperty("txt","foo");
		set.add(foo);
		set.add(bar);
		set.add(foo);
		set.add(bah);
		JsonArray r = set.getData();
		System.out.println("A\n"+r);
		//A
		//[{"txt":"foo"},{"txt":"bar"}]
		
		set.newSet();
		foo = new JsonObject();
		foo.addProperty("txt","foo");
		String x = Integer.toString(1);
		foo.addProperty("strt",x);
		bar = new JsonObject();
		x = Integer.toString(3);
		bar.addProperty("txt","foo");
		bar.addProperty("strt","3");
		set.addTriple(foo);
		set.addTriple(bar);
		r = set.getData();
		System.out.println("B\n"+r);
		//B
		//[{"txt":"foo","strt":"1"}]
		set.newSet();
		foo = new JsonObject();
		foo.addProperty("txt","foo");
		x = Integer.toString(1);
		foo.addProperty("strt",x);
		bar = new JsonObject();
		x = Integer.toString(3);
		bar.addProperty("txt","foo bar");
		bar.addProperty("strt","3");
		set.addTriple(foo);
		set.addTriple(bar);
		r = set.getData();
		System.out.println("C\n"+r);
		//C
		//[{"txt":"foo","strt":"1"}]  first one in wins
		set.newSet();
		foo = new JsonObject();
		foo.addProperty("txt","foo bar");
		x = Integer.toString(1);
		foo.addProperty("strt",x);
		bar = new JsonObject();
		x = Integer.toString(3);
		bar.addProperty("txt","foo");
		bar.addProperty("strt","3");
		set.addTriple(foo);
		set.addTriple(bar);
		r = set.getData();
		System.out.println("D\n"+r);
		// D [{"txt":"foo bar","strt":"1"}]
		
	
		
		System.exit(0);

	}

}
