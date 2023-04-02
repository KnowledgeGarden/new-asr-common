/**
 * 
 */
package org.topicquests.newasr.api;
import java.util.Map;
/**
 * @author jackpark
 *
 */
public interface IASREnvironment {

	
	
	//////////
	// Utilities
	//////////
	
	Map<String, Object> getProperties();

	Map<String, Object> getKafkaProperties();
	
	String getStringProperty(String key);

	String getKafkaProperty(String key);

	void shutDown();
	
	void logDebug(String message);
	
	void logError(String message, Exception e);
	
}
