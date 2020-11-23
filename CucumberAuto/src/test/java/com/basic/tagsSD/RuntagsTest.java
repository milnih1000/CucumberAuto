package com.basic.tagsSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	@CucumberOptions(			
			
			
				features= {"src/test/resources/com/basic/tagsFF/"},
				glue={"com/basic/tagsSD/"},
				
						plugin= {"pretty",
								"html:target/cucumber-htmlreport",
								"json:target/cucumber-report10.json",
								"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport10.html"
								}
				
				,monochrome = true
				//,dryRun = true
				,dryRun = false
				//,tags={"@Important"}, All scenarios executed, if this is tagge for featurefile
				//,tags={"@Smoke"}, Only tag with @smoke 
				//,tags={"@Smoke", "@Regression"} //AND condition
				,tags={"@Smoke,@Regression"} //OR condition
			)
	
	public class RuntagsTest {
			
	}