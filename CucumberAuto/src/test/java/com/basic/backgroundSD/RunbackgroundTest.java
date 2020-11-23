package com.basic.backgroundSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	@CucumberOptions(			
			
			
				features= {"src/test/resources/com/basic/backgroundFF/"},
				glue={"com/basic/backgroundSD"},
				
					plugin= {"pretty",
							"html:target/cucumber-htmlreport",
							"json:target/cucumber-report1.json",
                           "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport1.html"
							}
							
				,monochrome = true
				//,dryRun = true
				,dryRun = false
	)
	
	public class RunbackgroundTest {
			
	}