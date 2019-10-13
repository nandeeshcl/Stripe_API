package stepdefnitions;

import base.BaseClass;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass  {

	@Before
	public void beforeHook(Scenario scenario)
	{
		setup();
		System.out.println(scenario.getName()+" started execution");
		
	}
	
	@After
	public void afterHook(Scenario scenario)
	{
		System.out.println(scenario.getName()+" completed execution");
		System.out.println("Status is  "+scenario.getStatus());
		
		
	}
	
}
