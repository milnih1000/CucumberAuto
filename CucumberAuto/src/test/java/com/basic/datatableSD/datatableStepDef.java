package com.basic.datatableSD;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;



@SuppressWarnings("deprecation")
public class datatableStepDef {
	
	WebDriver driver =null;  
	
	
	
	@Given("^User need to be on Facebook login page$")
	public void user_need_to_be_on_Facebook_login_page() throws Throwable {
	 System.setProperty("webdriver.chrome.driver", "D:\\CucumberSetup\\chromedriver_win32\\chromedriver.exe");
	 driver = new ChromeDriver();
	  driver.get("https://www.facebook.com/"); 
	  Thread.sleep(5000);
	}

	
    @Then("^user clicks on new allesaccepteren button$")
     public void user_clicks_on_new_allesaccepteren_button() throws Throwable {
	driver.findElement(By.xpath("//button[@title='Alles accepteren']")).click();
	Thread.sleep(5000);

    }


    @Then("^user clicks on new account button$")
     public void user_clicks_on_new_account_button() throws Throwable {
	   driver.findElement(By.xpath("//a[@id='u_0_2']")).click();
	  Thread.sleep(5000);

   }
	
	@When("^User enters user \"([^\"]*)\" first name$")
	public void user_enters_user_first_name(String userName) throws Throwable {
	   driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(userName);
	   Thread.sleep(5000);

	}

	@Then("^user checks user \"([^\"]*)\" firstname is present$")
	public void user_checks_user_firstname_is_present(String userName) throws Throwable {
	 String userNameActual = driver.findElement(By.xpath("//input[@name='firstname']")).getAttribute("value");
	 Assert.assertEquals(userName, userNameActual);
	 Thread.sleep(5000);
	    
	
	}

	@And("^User enters user \"([^\"]*)\" surname$")
	public void user_enters_user_surname(String surName) throws Throwable {
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(surName);
		Thread.sleep(5000);
	
	}

	@Then("^User mobile field should be blank$")
	public void user_mobile_field_should_be_blank() throws InterruptedException  {
		String mobileActual =driver.findElement(By.xpath("//input[@name ='reg_email__']")).getAttribute("value");
		Assert.assertEquals("", mobileActual);
		Thread.sleep(5000);

    }
	@When("^Enter following data$")
	public void enter_following_data(DataTable table) throws Throwable {
		
		List<List<String>> data = table.raw();
		
	//	String values1 = data.get(0).get(0);
	//	String values2 = data.get(0).get(1);
	//	String values3 = data.get(0).get(2);
		
		String values4 = data.get(1).get(0);
		String values5 = data.get(1).get(1);
		String values6 = data.get(1).get(2);
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(values4);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(values5);
		driver.findElement(By.xpath("//input[@name ='reg_email__']")).sendKeys(values6);
		
						
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("//input[@name='firstname']")).clear();
		driver.findElement(By.xpath("//input[@name='lastname']")).clear();
		driver.findElement(By.xpath("//input[@name ='reg_email__']")).clear();
		
	String values7 = data.get(2).get(0);
	String values8 = data.get(2).get(1);
	String values9 = data.get(2).get(2);
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(values7);
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(values8);
	driver.findElement(By.xpath("//input[@name ='reg_email__']")).sendKeys(values9);	
	
	Thread.sleep(2000);
	}
	
		@Then("^close browser$")
		public void close_browser() throws Throwable {
			driver.quit();
			driver =null;
			
			Thread.sleep(10000);
			
			//kill chromedriver
			Runtime.getRuntime().exec("taskkill /im chromedriver.exe /f");
	}
}
		


 
