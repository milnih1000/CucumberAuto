package com.basic.multiSD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;

public class GoogleStepDef {
	
	
WebDriver driver =null;  
	
	
	@Given("^User need to be on Google login page$")
	public void user_need_to_be_on_google_login_page() throws Throwable {
	 System.setProperty("webdriver.chrome.driver", "D:\\CucumberSetup\\chromedriver_win32\\chromedriver.exe");
	 driver = new ChromeDriver();
	  driver.get("https://www.google.com/"); 
	  //Thread.sleep(5000);
	  
	  
	  Thread.sleep(10000);
		
		//kill chromedriver
		Runtime.getRuntime().exec("taskkill /im chromedriver.exe /f");
	  
	  }
	 
	
	}

	
