package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ebaysearchPOM {
	
	WebDriver driver;
	//create constractor
	
	public ebaysearchPOM (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="gh-ac")
	WebElement type ;
	public WebElement ebaysearch() {
	return  type ; 

}
	@FindBy(id="gh-btn")
	WebElement click_searchicon;
	public WebElement searchicon() {
		return  click_searchicon;
	}
	
}
