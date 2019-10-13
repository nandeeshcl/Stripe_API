package runner;

import java.io.File;

import org.testng.annotations.AfterClass;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.java.Before;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		
		plugin = { "json:target/cucumber.json", "pretty", "html:target/cucumber.html"
		 },
		
	
		
		features="./src/test/feature_file/",
		glue= "stepdefnitions",
		monochrome=true,
		strict=false
		
		)
public class RunCuke extends AbstractTestNGCucumberTests  {
	


}
