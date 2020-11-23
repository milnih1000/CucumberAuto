package com.basic.multiSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	@CucumberOptions(			
			
			
				features= {"src/test/resources/com/basic/multipleFF/"},
				glue={"com/basic/multiSD"},
				
						plugin= {"pretty",
								"html:target/cucumber-htmlreport",
								"json:target/cucumber-report7.json",
								 "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport7.html"
								}
				
				,monochrome = true
				//,dryRun = true
				,dryRun = false
	)
	
	public class RunmultiTest {
			
	}