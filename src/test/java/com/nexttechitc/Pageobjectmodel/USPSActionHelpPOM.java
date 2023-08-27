package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class USPSActionHelpPOM {
	
	WebDriver driver;
	
	public USPSActionHelpPOM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id=\"g-navigation\"]/div/nav/ul/li[7]/a[2]")
	WebElement Action_Help;
	public WebElement Help() {
		return Action_Help;
	}
	@FindBy(xpath="//*[@id=\"g-navigation\"]/div/nav/ul/li[7]/div/ul/li[1]/a")
	WebElement Click_FAQs;
	public WebElement FAQs() {
		return Click_FAQs;
	}
		
			
		

}
