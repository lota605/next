package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ebay {
	WebDriver driver;

	@Given("^user visits ebay Homepage$")
	public void user_visits_ebay_Homepage() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	   
	    
	 // how to open URL
	driver.get("https://www.ebay.com/");
	       Thread.sleep(3000);
	   
	}

	@When("^user clicks on Signin Button$")
	public void user_clicks_on_Signin_Button() throws Throwable {
	   
	}

	@Then("^user should be able to create a account$")
	public void user_should_be_able_to_create_a_account() throws Throwable {
	   
	}


	
	
}
