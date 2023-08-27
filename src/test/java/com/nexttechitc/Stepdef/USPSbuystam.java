package com.nexttechitc.Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttechitc.Pageobjectmodel.USPSbuystamPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class USPSbuystam {
	
	WebDriver driver;
	
	@Given("^user able to USPS project Stam$")
	public void user_able_to_USPS_project_Stam() throws Throwable {
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
			System.out.println("browser and url not opning");
		}
		}

	@When("^user click on Stam Supplies and click US Falg$")
	public void user_click_on_Stam_Supplies_and_click_US_Falg() throws Throwable {  
		try {
		//create obj
		 USPSbuystamPOM buyobj= new USPSbuystamPOM(driver);
		 buyobj.Stamsupplies().click();
		 buyobj.USFlag().click();
		 WebDriverWait Wait=new WebDriverWait(driver,20);
		 
		}
		 catch (Exception e) {
		System.out.println("stam click");
		 }
			 
		 
	   
	}

	@When("^user click Add to card and click checkout now$")
	public void user_click_Add_to_card_and_click_checkout_now() throws Throwable {
		try {
		 USPSbuystamPOM buyobj= new USPSbuystamPOM(driver);
		 buyobj.Addtocart().click();
		 buyobj.CheckOutNow().click();
		 
		 WebDriverWait Wait=new WebDriverWait(driver,20);
	    
	}
		catch(Exception e) {
			System.out.println("check out now work");
		}
		}

	@When("^user click checkout as Guest and type \"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"and\"([^\"]*)\"$")
	public void user_click_checkout_as_Guest_and_type_and(String arg1, String arg2, String arg3, String arg4) throws Throwable {
		
		 USPSbuystamPOM buyobj= new USPSbuystamPOM(driver);
		 buyobj.CheckOutGuest().click();
		 buyobj.FirstName().sendKeys(arg1);
	    buyobj.LastName().sendKeys(arg2);
	    buyobj.Phone().sendKeys(arg3);
	    buyobj.Email().sendKeys(arg4);
	    
	    WebDriverWait Wait=new WebDriverWait(driver,20);
	}

	@When("^user click in Box$")
	public void user_click_in_Box() throws Throwable {
		
		 USPSbuystamPOM buyobj= new USPSbuystamPOM(driver);
		 buyobj.Box().click();
		 
		 WebDriverWait Wait=new WebDriverWait(driver,20);
	  
	   
	}

	@When("^user type\"([^\"]*)\"\"([^\"]*)\"and \"([^\"]*)\"$")
	public void user_type_and(String arg1, String arg2, String arg3) throws Throwable {
		
		 USPSbuystamPOM buyobj= new USPSbuystamPOM(driver);
		 buyobj.Address1().sendKeys(arg1);
		 buyobj.Address2().sendKeys(arg2);
		 buyobj.City().sendKeys(arg3);
		 
		 WebDriverWait Wait=new WebDriverWait(driver,20);
		 
		 
	  
	}
	@When("^user select dropdown State and type\"([^\"]*)\" and click checkout$")
	public void user_select_dropdown_State_and_type_and_click_checkout(String arg1) throws Throwable {
		
		 USPSbuystamPOM buyobj= new USPSbuystamPOM(driver);
		 Select dropdown=new Select(buyobj.State());
		 dropdown.selectByVisibleText("MA - Massachusetts");
		 Thread.sleep(3000);
		 buyobj.ZipCode().sendKeys(arg1);
	    buyobj.CheckOut().click();
	    
	    WebDriverWait Wait=new WebDriverWait(driver,20);
	   


}
	@Then("^user should be redirects Buy Stam$")
	public void user_should_be_redirects_Buy_Stam() throws Throwable {
	   
	}
}
