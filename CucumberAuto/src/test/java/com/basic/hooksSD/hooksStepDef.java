package com.basic.hooksSD;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;



@SuppressWarnings("deprecation")
public class hooksStepDef {
	
	WebDriver driver =null;  
	
	@Before(order=1)
	public void beforeSetup1() throws InterruptedException{
		System.out.println("in before1");
		 System.setProperty("webdriver.chrome.driver", "D:\\CucumberSetup\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		  Thread.sleep(5000);
	}
	@Before(order=2)
	public void beforeSetup2() throws InterruptedException{
		System.out.println("in before2");
		  Thread.sleep(5000);
		
	}
	
	@Given("^User need to be on Facebook login page$")
	public void user_need_to_be_on_Facebook_login_page() throws Throwable {
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
	
//	@Then("^close browser$")
//    public void close_browser() throws Throwable {
//       driver.quit();
//       driver =null;
//    }


	@After(order=2)
	public void tearDown1(){
		System.out.println("In after1");
		driver.quit();
		driver =null;	
}
	@After(order=1)
	public void tearDown2() throws IOException{
		System.out.println("In after2");
		
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//kill chromedriver
		Runtime.getRuntime().exec("taskkill /im chromedriver.exe /f");
		
		
}
	}
		


 
