package com.basic.multiplescenarioSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	@CucumberOptions(			
			
			
				features= {"src/test/resources/com/basic/multiplescenarioFF/"},
				glue={"com/basic/multiplescenarioSD"},
				
						plugin= {"pretty",
								"html:target/cucumber-htmlreport",
								"json:target/cucumber-report6.json",
								 "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport6.html"
								}
				
				,monochrome = true
				//,dryRun = true
				,dryRun = false
	)
	
	public class RunMyMultipleScenarioTest {
			
	}