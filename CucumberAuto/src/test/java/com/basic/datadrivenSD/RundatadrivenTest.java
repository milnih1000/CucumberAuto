package com.basic.datadrivenSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	@CucumberOptions(			
			
			
				features= {"src/test/resources/com/basic/DataDrivenFF/"},
				glue={"com/basic/datadrivenSD"},
				
					plugin= {"pretty",
							"html:target/cucumber-htmlreport",
							"json:target/cucumber-report2.json",
							 "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport2.html"
							}
				,monochrome = true
			//	,dryRun = true
				,dryRun = false
	)
	
	public class RundatadrivenTest {
			
	}