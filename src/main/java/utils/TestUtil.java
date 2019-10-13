package utils;

import org.json.JSONObject;

import io.restassured.response.Response;

public class TestUtil {

	
	//To check ID is present method
	public static boolean checkJsonHasKey(String key,Response response)
	{
		JSONObject json=new JSONObject(response.asString());     //store response in json
		return json.has(key); //check this key is present in response
	}
	
	
	//For report Logging
	//Used in each steps
	//to insert all loging info in report
	//Create Node for gherkin keyword (MIddle of report) with provided message
}

