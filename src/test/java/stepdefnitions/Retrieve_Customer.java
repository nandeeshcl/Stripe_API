package stepdefnitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

import org.testng.Assert;

import base.BaseClass;

public class Retrieve_Customer extends BaseClass {

	public static JsonPath reponseJson;

	@When("I send Get request")
	public void i_send_Get_request() {
		response = reqSpecs.get(configProperty.getretrieveCustomerAPIEndPoint());
	}

	@Then("status code should be <status_code>")
	public void status_code_should_be_status_code() {
		Assert.assertEquals(response.statusCode(), 200);
	}

	// Check Specific value is available or not
	@Then("same customer id should be in response")
	public void same_customer_id_should_be_in_response() {
		reponseJson = response.jsonPath();
		String customerID = reponseJson.get("id");
		System.out.println(customerID);

		Assert.assertEquals(customerID, "cus_G0Tr6wBtgzIlbt");
	}

	// Check specific string is avaialble in response
	@Then("response should consists <balance>")
	public void response_should_consists_balance() {

		// Convert response to string
		String sResponse = response.asString();
		// Print response
		// System.out.println(sResponse);
		Assert.assertEquals(sResponse.contains("balance"), true);

	}

	//Check key value
	@Then("object should be customer")
	public void object_should_be_customer() {
		
		
		//Assert.assertEquals(reponseJson.get("object"), "customer");
		
		
	}

}
