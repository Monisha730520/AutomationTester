package org.stepdefinitions;

import java.io.IOException;

import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.*;

public class HooksClass extends BaseClass {
	
	@Before()
	public void beforeScenario() {
		System.out.println(".............BeforeScenario..........1");
		browsers("Chrome");
		urlLaunch("https://dev-platform-tour.kavida.ai/kavida/start-tour");
		impWait(20);

	}
	@After()
	public void afterScenario(Scenario sc) throws IOException {
		System.out.println("...........AfterScenario........");
		
		String name = sc.getName();
		getScreenshortAs(name);
		quit();
		
	}

}
