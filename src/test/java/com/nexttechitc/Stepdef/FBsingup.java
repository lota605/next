package com.nexttechitc.Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttechitc.Pageobjectmodel.FBsingupPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FBsingup {
	WebDriver driver;

	@Given("^user visiting facebook url$")
	public void user_visiting_facebook_url() throws Throwable {
		 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		    driver = new ChromeDriver();
		    //implicit wait
		    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		   
		    
		 // how to open URL
		driver.get("https://www.Facebook.com/en-us");
		       Thread.sleep(3000);
		       
	    //maximinze window
		       driver.manage().window().maximize();
	}
	@When("^user enter \"([^\"]*)\"  \"([^\"]*)\" and valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_and_valid_and(String arg1, String arg2, String arg3, String arg4) throws Throwable {
		
		FBsingupPOM fbsingupobj=new FBsingupPOM(driver);
		
		fbsingupobj.firstname().sendKeys(arg1);
		fbsingupobj.lastname().sendKeys(arg2);
		fbsingupobj.email().sendKeys(arg3);
		fbsingupobj.password().sendKeys(arg4);
		
		WebDriverWait wait=new WebDriverWait(driver,20);

		
		
	  
	}

	@Then("^user select dropdown Month and dropdown Day and dropdown Year$")
	public void user_select_dropdown_Month_and_dropdown_Day_and_dropdown_Year() throws Throwable {
		
		FBsingupPOM fbsingupobj=new FBsingupPOM(driver);
		 
		
		Select dropdown=new Select (fbsingupobj.click_month);
		  dropdown.selectByIndex(2);
		  Thread.sleep(3000);
		  
		  Select dropdown1=new Select (fbsingupobj.click_day);
		  dropdown1.selectByValue("2");
		  Thread.sleep(3000);
		  
		  Select dropdown2=new Select (fbsingupobj.click_year);
		  dropdown2.selectByVisibleText("2000");
		  Thread.sleep(3000);
		  
		  WebDriverWait wait=new WebDriverWait(driver,20);
		  //driver.close();
		  driver.quit();

	    
	}


}
