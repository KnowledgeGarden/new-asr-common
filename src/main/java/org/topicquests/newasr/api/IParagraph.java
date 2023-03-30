/**
 * 
 */
package org.topicquests.newasr.api;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

/**
 * @author jackpark
 *
 */
public interface IParagraph  extends IAddressable {
	public static final String
		SENTENCE_ID_FIELD		= "sIds";

	void setDocumentId(long id);
	
	/**
	 * Default return is {@code -1}
	 * @return
	 */
	long getDocumentId();

	void setText(String text);
	String getText();

	void addSentenceId(long id);
	void setSentenceIds(JsonArray ids);
	
	/**
	 * Can return {@code null}
	 * @return
	 */
	JsonArray getSentenceIds();
	
	JsonObject getData();
}
