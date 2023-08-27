package com.nexttechitc.Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nexttechitc.Pageobjectmodel.DellActionServicePOM;
import com.nexttechitc.Pageobjectmodel.USPSActionHelpPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class USPSActionHelp {
	WebDriver driver;
	
	@Given("^user able to go USPS$")
	public void user_able_to_go_USPS() throws Throwable {
		
		try {

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
		       catch(Exception e) {
			       System.out.println("this is action class");
			  }
		
		       
		     
		}
	    
	    
	

	@When("^user go to Help dropdown menu and click FAQs$")
	public void user_go_to_Help_dropdown_menu_and_click_FAQs() throws Throwable {
		
		try { 
		 
		 Actions act=new Actions(driver);
		 
		 USPSActionHelpPOM helpobj=new  USPSActionHelpPOM (driver);
		  
		   act.moveToElement(helpobj.Help()).build().perform();
		   Thread.sleep(5000);
		   
		   helpobj.FAQs().click();
	   
	}
		  catch(Exception e) {
		       System.out.println("this is action class");
		  }
	}

	@Then("^user should be see How can we help$")
	public void user_should_be_see_How_can_we_help() throws Throwable {
	    
	}



}
