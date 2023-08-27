package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Facebook {
	
	WebDriver driver;
	
	@Given("^user visits Facebook homepage$")
	public void user_visits_Facebook_homepage() throws Throwable {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		    driver = new ChromeDriver();
		   
		    
		 // how to open URL
		driver.get("https://www.facebook.com/");
		       Thread.sleep(3000);
	    
	    
	}

	@When("^user clicks on sing in button$")
	public void user_clicks_on_sing_in_button() throws Throwable {
	   
	}

	@Then("^user should be able to create an account$")
	public void user_should_be_able_to_create_an_account() throws Throwable {
	    
	}



}
