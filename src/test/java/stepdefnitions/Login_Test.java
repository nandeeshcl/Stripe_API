package stepdefnitions;

import static io.restassured.RestAssured.*;

import java.io.File;
import java.util.HashMap;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Login_Test {

	public static void main(String[] args) {
		String token = getLoginToken();
		/*// send request to the download api
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("allocationID", "16");

		Response response = given().header("Content-Type", "application/json")
				.header("Authorization", "Bearer " + token).body(map)
				.post("https://joann-allocation-staging.impactanalytics.co/downloadLMMinMaxTemplate");
		response.prettyPrint();

		// sending request to upload api

		HashMap<String, String> map1 = new HashMap<String, String>();
		map.put("allocationID", "16");*/

		Response response1 = given().header("Content-Type", "text/plain")
				.header("Authorization", "Bearer " + token).multiPart("allocationID", "16")
				.multiPart("file",new File( "C:\\Users\\User\\Downloads\\LM-Min-Max-Template-impactuser-1570896174386.xlsx"))
				.post("https://joann-allocation-staging.impactanalytics.co/uploadLMMinMaxTemplate");
		response1.prettyPrint();
	}

	public static String getLoginToken() {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("emailID", "impact@impactanalytics.co");
		map.put("password", "impactpasswordnew");
		Response response = given().contentType(ContentType.JSON).body(map)
				.post("https://joann-allocation-staging.impactanalytics.co/login");
		// response.prettyPrint();
		JsonPath responseJson = response.jsonPath();
		String token = responseJson.get("token");
		return token;
	}

}
