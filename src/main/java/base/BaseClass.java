package base;

import org.aeonbits.owner.ConfigFactory;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utils.ConfigProperties;

public class BaseClass {

	// Owner API
	public static ConfigProperties configProperty;

	// Request Specification
	public static RequestSpecification reqSpecs;

	// Response
	public static Response response;
	

	public void setup() {

		// Owner API Config Property
		configProperty = ConfigFactory.create(ConfigProperties.class);

		// Keep Base URI and Base Path
		RestAssured.baseURI = configProperty.getBaseURI();
		RestAssured.basePath = configProperty.getBasePath();
		
	}
}
