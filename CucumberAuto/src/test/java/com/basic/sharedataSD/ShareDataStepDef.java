package com.basic.sharedataSD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class ShareDataStepDef {
	
	WebDriver driver ;  
	
	
	public ShareDataStepDef(SharedClass share){
 	driver = share.setup();
		
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
	}
		


 
