package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)

@CucumberOptions(plugin = { "html:target/cucumber-html-report",
        "json:target/cucumber.json", "pretty:target/cucumber-pretty.txt",
        "usage:target/cucumber-usage.json", "junit:target/cucumber-results.xml" },
             features="src/test/resources", glue="org.stepdefinitions" )

//@RunWith(Cucumber.class)
//@CucumberOptions(features="src/test/resources", glue="org.stepdefinitions", plugin= {"pretty","html:target/Destination",
//		
//		},
//monochrome=true)
public class TestRunner {


}