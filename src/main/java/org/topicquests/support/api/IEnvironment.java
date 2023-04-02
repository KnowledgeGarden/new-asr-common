/**
 * 
 */
package org.topicquests.support.api;

/**
 * @author jackpark
 *
 */
public interface IEnvironment {
	void shutDown();
	
	void logDebug(String message);
	
	void logError(String message, Exception e);
}
