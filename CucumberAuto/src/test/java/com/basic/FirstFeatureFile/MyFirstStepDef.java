package com.basic.FirstFeatureFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;



@SuppressWarnings("deprecation")
public class MyFirstStepDef {
	
	WebDriver driver =null;
	
	
	@Given("^User need to be on Facebook login page$")
	public void user_need_to_be_on_Facebook_login_page() throws Throwable {
	 System.setProperty("webdriver.chrome.driver", "D:\\CucumberSetup\\chromedriver_win32\\chromedriver.exe");
	 driver = new ChromeDriver();
	  driver.get("https://www.facebook.com/"); 
	  System.out.println("opening UR");
	  Thread.sleep(5000);
	  
	}

	@When("^User enters user first name$")
	public void user_enters_user_first_name() throws Throwable {
	   driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).sendKeys("David");
	   Thread.sleep(5000);    
	}

	@Then("^user checks user firstname is present$")
	public void user_checks_user_firstname_is_present() throws Throwable {
		 String userNameActual = driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).getAttribute("value");
		 Assert.assertEquals("David", userNameActual);
		  Thread.sleep(5000);
	}
	
	@Then("^close browser$")
    public void close_browser() throws Throwable {
       driver.quit();
       driver =null;
    }

}

