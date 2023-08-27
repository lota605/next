package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nexttechitc.Pageobjectmodel.DellActionServicePOM;
import com.nexttechitc.Pageobjectmodel.DellActionSupportPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DellActionSupport {
	
	WebDriver driver;
	
	@Given("^user visits to able dell homepage$")
	public void user_visits_to_able_dell_homepage() throws Throwable {
		//how to open browser
		 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		    driver = new ChromeDriver();
		   
		    
		 // how to open URL
		driver.get("https://www.dell.com/en-us");
		       Thread.sleep(3000);
		       
		       //maximinze window
		       driver.manage().window().maximize();
	    
	}
	

	@When("^user go to Support dropdown menu and able to see Support Home$")
	public void user_go_to_Support_dropdown_menu_and_able_to_see_Support_Home() throws Throwable {
		
		 
		   
		 //  ser.Support().click(); Actions act=new Actions(driver);
		 Actions act=new Actions(driver);
		   DellActionSupportPOM ser=new  DellActionSupportPOM (driver);
		   act.moveToElement(ser.Support()).build().perform();
		   Thread.sleep(5000);
		   
		   ser.SupportHome().click();
	   
	}

	@Then("^user redirects to Support Home$")
	public void user_redirects_to_Support_Home() throws Throwable {
	  
	}



}
