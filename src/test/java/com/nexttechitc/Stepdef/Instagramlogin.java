package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechitc.Pageobjectmodel.InstagramloginPOM;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Instagramlogin {
	WebDriver driver;

	@Given("^user visit Instagram homepage$")
	public void user_visit_Instagram_homepage() throws Throwable {
		 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		    driver = new ChromeDriver();
		   
		    
		 // how to open URL
		driver.get("https://www.instagram.com/");
		       Thread.sleep(3000);
		       
		       //maximize window
		       driver.manage().window().maximize();
	  
	}

	@When("^user enter \"([^\"]*)\"and \"([^\"]*)\"$")
	public void user_enter_and(String arg1, String arg2) throws Throwable {
		InstagramloginPOM loginobj=new InstagramloginPOM(driver);
		loginobj.phonenumber().sendKeys(arg1);
		loginobj.password().sendKeys(arg2);
	  
	}

	@When("^user click Log in button$")
	public void user_click_Log_in_button() throws Throwable {
		
		InstagramloginPOM loginobj=new InstagramloginPOM(driver);
		loginobj.login().click();
	   
	}

	@Then("^user able to Log in Instagram$")
	public void user_able_to_Log_in_Instagram() throws Throwable {
	   
	}


}
