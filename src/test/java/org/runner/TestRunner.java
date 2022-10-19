package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.test.JVMReports;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( features="src/test/resources",
                  glue="org.stepdefinitions",tags= {"@smoke"},
                  dryRun=false,
                  monochrome=true,
                  
                  
                  plugin= {"pretty",
                		  "html:src\\main\\resources\\cucumber-html-report",
                		  "json:src\\main\\resources\\Reports\\JsonReport\\jsonReport.json",
                		  "junit:src\\main\\resources\\Reports\\junitReport\\report.xml"
}  
                  

)
public class TestRunner {
	@AfterClass
	public static void report() {
		JVMReports.generateJVMReport("src\\main\\resources\\Reports\\JsonReport\\jsonReport.json");
		System.out.println("Done");

	}

}
