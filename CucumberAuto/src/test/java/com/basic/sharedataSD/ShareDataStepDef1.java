package com.basic.sharedataSD;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

	@SuppressWarnings("deprecation")
	public class ShareDataStepDef1 {
	WebDriver driver ;  
		
	
	public ShareDataStepDef1(SharedClass share){
		driver = share.setup();
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
	public void user_mobile_field_should_be_blank() throws InterruptedException, IOException  {
		String mobileActual =driver.findElement(By.xpath("//input[@name ='reg_email__']")).getAttribute("value");
		Assert.assertEquals("", mobileActual);
		
	
		Thread.sleep(10000);
		
		//kill chromedriver
		Runtime.getRuntime().exec("taskkill /im chromedriver.exe /f");
	
	
	}
	
}

	
	