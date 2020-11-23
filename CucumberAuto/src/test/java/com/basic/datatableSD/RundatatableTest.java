package com.basic.datatableSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	@CucumberOptions(			
			
			
				features= {"src/test/resources/com/basic/datatableFF/"},
				glue={"com/basic/datatableSD"},
				
					plugin= {"pretty",
							"html:target/cucumber-htmlreport",
							"json:target/cucumber-report3.json",
							 "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport3.html"
							}
				,monochrome = true
				//,dryRun = true
				,dryRun = false
	)
	
	public class RundatatableTest {
			
	}