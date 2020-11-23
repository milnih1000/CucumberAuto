package com.basic.hooksSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	@CucumberOptions(			
			
			
				features= {"src/test/resources/com/basic/hooksFF/"},
				glue={"com/basic/hooksSD"},
				
						plugin= {"pretty",
								"html:target/cucumber-htmlreport",
								"json:target/cucumber-report5.json",
								 "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport5.html"
								}
				
				,monochrome = true
				//,dryRun = true
	    		,dryRun = false
	)
	
	public class RunhooksTest {
			
	}