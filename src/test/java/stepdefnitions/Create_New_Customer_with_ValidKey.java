package stepdefnitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.path.json.JsonPath;
import utils.TestUtil;

import static io.restassured.RestAssured.*;

import org.testng.Assert;

import base.BaseClass;

public class Create_New_Customer_with_ValidKey extends BaseClass {
	
	
	@Given("I have valid auth key")
	public void i_have_valid_auth_key() {

		reqSpecs = given().auth().basic(configProperty.getValidAuthKey(), "");
		
		
	}

	@Given("I have Balance amount {int}")
	public void i_have_Balance_amount(int bal) {
		reqSpecs = reqSpecs.formParam("balance", bal);
		
	}

	@Given("I have Description {string}")
	public void i_have_Description(String desc) {
		reqSpecs = reqSpecs.formParam("description", desc);
	}

	@When("I send post request")
	public void i_send_post_request() {
		response = reqSpecs.post(configProperty.getcreateCustomerAPIEndPoint());
		//response.prettyPrint();
	}

	@Then("the status code should be {int}")
	public void the_status_code_should_be(int status_code) {
		// Validate Status Code
		Assert.assertEquals(response.getStatusCode(), status_code);
	}

	@Then("the field {string} should in the response")
	public void the_field_should_in_the_response(String id) {

		// Check id field is available in response
		Assert.assertTrue(TestUtil.checkJsonHasKey("id", response));
	}

	@Then("the Balance amount should be {int}")
	public void the_Balance_amount_should_be(int balance) {

		// To CHeck balance amount
		JsonPath responseJson = response.jsonPath();
		Assert.assertEquals(responseJson.get("balance"), balance);

	}
	
	//Invalid Auth-Key
	
	@Given("I have In-valid auth key")
	public void i_have_In_valid_auth_key() {
		reqSpecs = given().auth().basic(configProperty.getInvalidAuthKey(), "");
	}

	@Then("the field id should not be in the response")
	public void the_field_id_should_not_be_in_the_response() {
		// Check id field is not available in response
		Assert.assertFalse(TestUtil.checkJsonHasKey("id", response));
	}
	
	

}
