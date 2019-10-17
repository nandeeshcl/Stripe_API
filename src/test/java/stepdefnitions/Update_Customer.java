package stepdefnitions;

import org.testng.Assert;

import base.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.path.json.JsonPath;

public class Update_Customer extends BaseClass {
	
	@Given("new Balance {int}")
	public void new_Balance(int bal) {
		reqSpecs=reqSpecs.formParam("balance",bal);
	}

	@Given("new Description {string}")
	public void new_Description(String desc) {
		reqSpecs=reqSpecs.formParam("description", desc);
	}

	@When("I send post request for update customer api")
	public void i_send_post_request_for_update_customer_api() {
		response=reqSpecs.post(configProperty.getupdateCustomerAPIEndPoint());
	}

	@Then("response should have balance {int} and description {string}")
	public void response_should_have_balance_and_description(int bal, String desc) {
		JsonPath responseJson = response.jsonPath();
		Assert.assertEquals(responseJson.get("balance"),bal);
		Assert.assertEquals(responseJson.get("description"), desc);
	}	
	

}
