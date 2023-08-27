package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InstagramloginPOM {

	
	WebDriver driver;
	
public InstagramloginPOM(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//input[@aria-label=\"Phone number, username, or email\"]")
WebElement Type_phonenumber;
public WebElement phonenumber () { 
	return Type_phonenumber;
	
}
@FindBy(xpath="//input[@aria-label=\"Phone number, username, or email]")
WebElement Typr_password;
public WebElement password() {
	return Typr_password;
	
}
@FindBy(xpath="/html/body/div[2]/div/div/div[1]/div/div/div/div[1]/section/main/article/div[2]/div[1]/div[2]/form/div/div[3]")
		WebElement click_login;
public WebElement login() {
	return click_login;
}


}
