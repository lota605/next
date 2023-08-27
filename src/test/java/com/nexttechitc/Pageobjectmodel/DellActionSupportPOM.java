package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellActionSupportPOM {
	
	WebDriver driver;
	
	public DellActionSupportPOM (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//keep webelement
	@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[5]/button/span")
	WebElement Action_Support;
	public WebElement Support() {
		return Action_Support;
	}
	@FindBy (xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[5]/ul/li[3]/a")
	WebElement Click_SupportHome;
	public WebElement SupportHome() {
		return Click_SupportHome;
		
	}
	
	
	

}
