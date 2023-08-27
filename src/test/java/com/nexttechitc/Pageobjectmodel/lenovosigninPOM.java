package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class lenovosigninPOM {
	
	WebDriver driver;
	
	public lenovosigninPOM (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
	@FindBy (xpath="//*[@id=\"b69672ce6abb6-4d8a-986e-6d4382535a61\"]/div[4]/div[2]/div[3]/ul[1]/li[7]/div[1]/img[2]")
	WebElement signin_dropdown;
	public WebElement Signindropdown() {
		return signin_dropdown;
	
	}
	@FindBy(xpath="//*[@id=\"b69672ce6abb6-4d8a-986e-6d4382535a61\"]/div[4]/div[2]/div[3]/ul[1]/li[7]/div[2]/div[2]/p[1]/span[1]")
	WebElement click_Signin;
	public WebElement Signin() {
		return click_Signin;
	}
	@FindBy(xpath="//*[@id=\"3a31ad87-f33b-4fa3-9ec9-7744d7c1f74d\"]/main/div[1]/div[2]/div[1]/button")
	WebElement click_createID;
	public WebElement CreateID() {
		return click_createID;
	}
	@FindBy(xpath="//*[@id=\"personal\"]/div[2]/span")
	WebElement click_myself;
	public WebElement ForMyself() {
		return click_myself;
	}
	@FindBy(xpath="//*[@id=\"continueEmail\"]/span")
	WebElement click_continuewithEmail;
	public WebElement ContinuewithEmail() {
		return click_continuewithEmail;
	}
	@FindBy(xpath="//*[@id=\"uEmail\"]")
	WebElement type_Email;
	public WebElement Email() {
		return type_Email;
	}
	@FindBy(xpath="//*[@id=\"uFname\"]")
	WebElement type_Firstname;
	public WebElement FirstName() {
		return type_Firstname;
	}
	@FindBy(xpath="//*[@id=\"uLname\"]")
	WebElement type_lastname;
	public WebElement LastName() {
		return type_lastname;
	}
	@FindBy(xpath="//*[@id=\"upwd\"]")
	WebElement type_password;
	public WebElement Password() {
		return type_password;
	}
	@FindBy(xpath="//*[@id=\"cpwd\"]")
	WebElement type_confirmpassword;
	public WebElement ConfirmPassword() {
		return type_confirmpassword;
	}
	@FindBy(xpath="//*[@id=\"fcd6ebf7-579a-411e-bb19-8dffd8bdbd49\"]/main/div[3]/form/div[2]/div[2]/div[1]/div/input")
	WebElement select_rrewards;
	public WebElement RewardsSignup() {
		return select_rrewards;
	}
	@FindBy(xpath="//*[@id=\"fcd6ebf7-579a-411e-bb19-8dffd8bdbd49\"]/main/div[3]/form/div[2]/div[3]/div[1]/div[1]/div/input")
	WebElement select_Emailsignup;
	public WebElement EmailSignup() {
		return select_Emailsignup;
	}
	@FindBy(xpath="//*[@id=\"fcd6ebf7-579a-411e-bb19-8dffd8bdbd49\"]/main/div[3]/form/div[2]/div[4]/div[1]/div/input")
	WebElement click_policy;
	public WebElement Policy() {
		return click_policy;
	}
	
	
	
	
	
	
	
}
