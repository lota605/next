package com.nexttechitc.Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.nexttechitc.Pageobjectmodel.USPSregisterPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class USPSregister {
	
	WebDriver driver;
	

@Given("^user visit able to USPS page$")
public void user_visit_able_to_USPS_page() throws Throwable {
	//how to open browser?
		 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		    driver = new ChromeDriver();
		   
		    
		 // how to open URL
		driver.get("https://www.usps.com/");
		       Thread.sleep(3000);
		       
		       //maximize window
		       driver.manage().window().maximize();
}

@When("^user Click on Register and Click Sign Up Now$")
public void user_Click_on_Register_and_Click_Sign_Up_Now() throws Throwable {
	
	 USPSregisterPOM regobj= new USPSregisterPOM(driver);
	 regobj.Register().click();
	 regobj.SignUpNow().click();
   
}

@When("^user select dropdown choose language English$")
public void user_select_dropdown_choose_language_English() throws Throwable {
	
	 USPSregisterPOM regobj= new USPSregisterPOM(driver);
	 
	 Select dropdown=new Select(regobj.Click_English());
	 dropdown.selectByVisibleText("English");
	 Thread.sleep(3000);
    
}

@When("^user enter \"([^\"]*)\" \"([^\"]*)\"and \"([^\"]*)\"$")
public void user_enter_and(String arg1, String arg2, String arg3) throws Throwable {
	
	 USPSregisterPOM regobj= new USPSregisterPOM(driver);
	 regobj.Username().sendKeys(arg1);
	 regobj.Password().sendKeys(arg2);
	 regobj.ReTypepassword().sendKeys(arg3);
   
}
@When("^user select dropdown First security question and \"([^\"]*)\" and\"([^\"]*)\"$")
public void user_select_dropdown_First_security_question_and_and(String arg1, String arg2) throws Throwable {

	USPSregisterPOM regobj= new USPSregisterPOM(driver);
	
	Select dropdown=new Select(regobj.FirstQuestion());
	dropdown.selectByVisibleText("In what city were you born?");
	Thread.sleep(3000);
	
	regobj.TypeAnswer1().sendKeys(arg1);
	regobj.ReTypeAnswer1().sendKeys(arg1);
	
}


@When("^user select dropdown Second security question and \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_select_dropdown_Second_security_question_and_and(String arg1, String arg2) throws Throwable {
	
	USPSregisterPOM regobj= new USPSregisterPOM(driver);
	Select dropdown=new Select(regobj.SecondQuestion());
	dropdown.selectByVisibleText("What is your favorite holiday?");
	Thread.sleep(3000);
	
	regobj.TypeAnswer2().sendKeys(arg1);
	regobj.ReTypeyAnswer2().sendKeys(arg1);
   
}

@When("^user Click Personal Account and Type \"([^\"]*)\"\"([^\"]*)\"$")
public void user_Click_Personal_Account_and_Type(String arg1, String arg2) throws Throwable {
	
	USPSregisterPOM regobj= new USPSregisterPOM(driver);
	regobj.PersonalAccount().click();
	regobj.FirstName().sendKeys(arg1);
	regobj.LastName().sendKeys(arg2);
   
}

@When("^user Type \"([^\"]*)\"and\"([^\"]*)\"$")
public void user_Type_and(String arg1, String arg2) throws Throwable {
	
	USPSregisterPOM regobj= new USPSregisterPOM(driver);
	regobj.EmailAddress().sendKeys(arg1);
	regobj.RetypeEmail().sendKeys(arg2);
}

@When("^user select dropdown US and \"([^\"]*)\"$")
public void user_select_dropdown_US_and(String arg1) throws Throwable {
	
	USPSregisterPOM regobj= new USPSregisterPOM(driver);
	Select dropdown=new Select(regobj.US());
	dropdown.selectByVisibleText("US");
	Thread.sleep(3000);
	
	regobj.Phone().sendKeys(arg1);
   
}

@When("^user select dropdown country and Type \"([^\"]*)\"\"([^\"]*)\"and\"([^\"]*)\"$")
public void user_select_dropdown_country_and_Type_and(String arg1, String arg2, String arg3) throws Throwable {
	
	USPSregisterPOM regobj= new USPSregisterPOM(driver);
	Select dropdown=new Select(regobj.Country());
	dropdown.selectByVisibleText("UNITED STATES");
	Thread.sleep(3000);
	
	regobj.SteetAddress().sendKeys(arg1);
	regobj.Apt().sendKeys(arg2);
	regobj.City().sendKeys(arg3);
    
}

@When("^user select dropdown State and Type \"([^\"]*)\"$")
public void user_select_dropdown_State_and_Type(String arg1) throws Throwable {
	
	USPSregisterPOM regobj= new USPSregisterPOM(driver);
	Select dropdown=new Select(regobj.State());
	dropdown.selectByVisibleText("MA - Massachusetts");
	Thread.sleep(3000);
	regobj.ZipCode().sendKeys(arg1);
	
}

@When("^user click Verify Adress and click create Account$")
public void user_click_Verify_Adress_and_click_create_Account() throws Throwable {
	
	USPSregisterPOM regobj= new USPSregisterPOM(driver);
	regobj.VerifyAddress().click();
	regobj.CreateAccount().click();
}

@Then("^user should able to creat Register$")
public void user_should_able_to_creat_Register() throws Throwable {
   
}



}
