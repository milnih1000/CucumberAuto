package com.basic.FirstFeatureFile;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	@CucumberOptions(			
			
			
				features= {"src/test/resources/com/basic/FirstFeautureFileFF/"},
				glue={"com/basic/FirstFeatureFile"},
				
						plugin= {"pretty",
								"html:target/cucumber-htmlreport",
								"json:target/cucumber-report4.json",
								"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport4.html"
								}
				
				,monochrome = true
				//,dryRun = true
				,dryRun = false
	)
	
	public class RunMyFirstFeatureTest {
			
	}