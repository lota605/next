package com.nexttechitc.Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechitc.Pageobjectmodel.USPSsigninPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class USPSsignin {
	
	WebDriver driver;

@Given("^user visit USPS homepage$")
public void user_visit_USPS_homepage() throws Throwable {
	
	//how to open browser?
	 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	    
	    //implicit Wait
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   
	    
	 // how to open URL
	driver.get("https://www.usps.com/");
	       Thread.sleep(3000);
	       
	       //maximize window
	       driver.manage().window().maximize();
    
}

@When("^user click on signin button$")
public void user_click_on_signin_button() throws Throwable {
	USPSsigninPOM logobj=new USPSsigninPOM(driver);
	logobj.Signin().click();
	Thread.sleep(3000);
	
	
   
}

@When("^user insert valid \"([^\"]*)\" and valid \"([^\"]*)\" and click next$")
public void user_insert_valid_and_valid_and_click_next(String arg1, String arg2) throws Throwable {
	
	USPSsigninPOM logobj=new USPSsigninPOM(driver);
	logobj.username().sendKeys(arg1);
	logobj.PW().sendKeys(arg2);
	logobj.signicon().click();
	Thread.sleep(4000);
   
}

@Then("^user should be able to log in$")
public void user_should_be_able_to_log_in() throws Throwable {
 
}



}
