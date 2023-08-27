package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellActionServicePOM {
	WebDriver driver;
	
	public DellActionServicePOM (WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);

}
	//keep webelemant
	@FindBy (xpath="//*@id=\"unifide-masthead-navigation\"]/nav/ul/li[4]/button/span")
	WebElement Action_Service;
	public WebElement Service() {
		return Action_Service;
	}

	@FindBy (xpath="//*@id=\"unifide-masthead-navigation\"]/nav/ul/li[4]/ul/li[3]/a")
	WebElement click_viewallservice ;
	public WebElement viewallservice() {
		return click_viewallservice ;
	
}
}
