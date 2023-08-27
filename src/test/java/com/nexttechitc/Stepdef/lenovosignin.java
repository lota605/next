package com.nexttechitc.Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nexttechitc.Pageobjectmodel.lenovosigninPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class lenovosignin {
	
	WebDriver driver;
	
	
	
	@Given("^user visite Lenovo homepage$")
	public void user_visite_Lenovo_homepage() throws Throwable {
	 
				//how to open browser
				 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
				    driver = new ChromeDriver();
				    
				    //implicit Wait
				    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				   
				   
				    
				 // how to open URL
				driver.get("https://www.lenovo.com");
				       Thread.sleep(3000);
				       
				       //maximize window
				       driver.manage().window().maximize();
	}
	

	@When("^user Signin dropdown and click Signin and click create Lenovo ID$")
	public void user_Signin_dropdown_and_click_Signin_and_click_create_Lenovo_ID() throws Throwable {
		//create obj
		 Actions act=new Actions(driver);
		 lenovosigninPOM obj=new lenovosigninPOM(driver);
		 
		 act.moveToElement(obj.Signindropdown()).build().perform();
		
		 obj.Signin().click();
		 obj.CreateID().click();
		 
		 Thread.sleep(3000);
	   
	}

	@When("^user click For Myself and click Continue with Email and type \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_click_For_Myself_and_click_Continue_with_Email_and_type_and_and_and_and(String arg1, String arg2, String arg3, String arg4, String arg5) throws Throwable {
		 lenovosigninPOM obj=new lenovosigninPOM(driver);
		 obj.ForMyself().click();
		 obj.ContinuewithEmail().click();
		 obj.Email().sendKeys(arg1);
		 obj.FirstName().sendKeys(arg2);
		 obj.LastName().sendKeys(arg3);
		 obj.Password().sendKeys(arg4);
		 obj.ConfirmPassword().sendKeys(arg5);
		 
		 Thread.sleep(3000);
	}

	@When("^user select Rewands Signin and select Email SignUp and click Policy$")
	public void user_select_Rewands_Signin_and_select_Email_SignUp_and_click_Policy() throws Throwable {
		
		 lenovosigninPOM obj=new lenovosigninPOM(driver);
		 obj.RewardsSignup().click();
		 obj.EmailSignup().click();
		 
		 Thread.sleep(3000);
	}

	@Then("^user click on create Lenovo ID$")
	public void user_click_on_create_Lenovo_ID() throws Throwable {
	   
	}



}
