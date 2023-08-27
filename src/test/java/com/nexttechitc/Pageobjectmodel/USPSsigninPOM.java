package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class USPSsigninPOM {
	
	WebDriver driver;
	
	public USPSsigninPOM (WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);

}
	@FindBy(id="login-register-header")
	WebElement Click;
	public WebElement Signin() {
		return Click;
	}
	@FindBy(name="username")
	WebElement  username;
	public WebElement username() {
		return username;
	}
	@FindBy(name="password")
	WebElement PW;
	public WebElement PW() {
		return PW;
	}
	@FindBy(id="btn-submit")
	WebElement signin;
	public WebElement signicon() {
		return signin;

		
	}
	
	
}
