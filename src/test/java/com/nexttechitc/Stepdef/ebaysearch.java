package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechitc.Pageobjectmodel.ebaysearchPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ebaysearch {
	
	WebDriver driver;
	
	@Given("^user visits able to ebay homepage$")
	public void user_visits_able_to_ebay_homepage() throws Throwable {
		//how to open browser?
		 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		    driver = new ChromeDriver();
		   
		    
		 // how to open URL
		driver.get("https://www.ebay.com/");
		       Thread.sleep(3000);
	   
	}
	
	@When("^user types\"([^\"]*)\"$")
	public void user_types(String arg1) throws Throwable {
		
		ebaysearchPOM searchobj=new ebaysearchPOM(driver);
		searchobj.ebaysearch().sendKeys(arg1);
	  Thread.sleep(4000);
	}

	@When("^user click in searchicon$")
	public void user_click_in_searchicon() throws Throwable {
		
		ebaysearchPOM searchobj=new ebaysearchPOM(driver);
		searchobj.searchicon().click();
		Thread.sleep(4000);
	   
	}

	@Then("^user should be able to see expected dresses$")
	public void user_should_be_able_to_see_expected_dresses() throws Throwable {
	  
	}



}
