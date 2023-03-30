/**
 * 
 */
package org.topicquests.newasr.api;

/**
 * @author jackpark
 *
 */
public interface IParagraph  extends IAddressable {

	void setDocumentId(long id);
	
	/**
	 * Default return is {@code -1}
	 * @return
	 */
	long getDocumentId();

	void setText(String text);
	String getText();

}
