package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class USPSbuystamPOM {
	
	WebDriver driver;
	
	//create constructor
	public  USPSbuystamPOM (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//capture Webelement
	@FindBy(xpath="//img[@alt=\"Stamp Icon Link for Buy Stamps\"]")
	WebElement Click_stamsupplies;
	public WebElement Stamsupplies() {
		return Click_stamsupplies;
	}
	@FindBy(xpath="//img[@alt=\"U.S. Flag 2023 Stamps\"]")
	WebElement Click_USflag;
	public WebElement USFlag() {
		return Click_USflag;
				
	}
	@FindBy(id="addToCartVisBtn122704")
    WebElement Click_addcart;
	public WebElement Addtocart() {
		return Click_addcart;
	}
	@FindBy(xpath="//*[@id=\"atg_button_checkout\"]")
	WebElement Click_checkout;
	public WebElement CheckOutNow() {
		return Click_checkout;
	}
	@FindBy(xpath="//*[@id=\"btn-guest-checkout-test\"]")
	WebElement Click_checkoutguest;
	public WebElement CheckOutGuest() {
		return Click_checkoutguest;
	}
	@FindBy(id="custFirstName")
	WebElement type_firstname;
	public WebElement FirstName() {
		return type_firstname;
	}
	@FindBy(id="custLastName")
	WebElement type_lastname;
	public WebElement LastName() {
		return type_lastname;
	}
	@FindBy(id="custPhone")
	WebElement type_phone;
	public WebElement Phone() {
		return type_phone;
	}
	@FindBy(id="custEmail")
	WebElement type_email;
	public WebElement Email() {
		return type_email;
	}
	@FindBy(xpath="//*[@id=\"billingInfo\"]/div[5]/div/div[1]/div/label/span")
	WebElement Click_box;
	public WebElement Box() {
		return Click_box;
	}
	@FindBy(xpath="//*[@id=\"moveToBillingBtn\"]/span")
	WebElement Click_checkoutnow;
	public WebElement CheckOutNow2() {
		return Click_checkoutnow;
	
	
	}
	@FindBy(xpath="//*[@id=\"shipAddress1\"]")
	WebElement type_address1;
	public WebElement Address1() {
		return type_address1;
	}
	@FindBy(xpath="//*[@id=\"shipAddress2\"]")
	WebElement type_address2;
	public WebElement Address2() {
		return type_address2;
	}
	@FindBy(xpath="//*[@id=\"shipCity\"]")
	WebElement type_city;
	public WebElement City() {
		return type_city;
	}
	@FindBy(xpath="//*[@id=\"shipState\"]")
	WebElement select_state;
	public WebElement State() {
		return select_state;
	}
	@FindBy(xpath="//*[@id=\"shipZip\"]")
	WebElement type_zipcode;
	public WebElement ZipCode() {
		return type_zipcode;
	}
	@FindBy(xpath="//*[@id=\"moveToBillingBtn\"]/span")
	WebElement clicl_checkout;
	public WebElement CheckOut() {
		return clicl_checkout;
	}
	
	
	
	
				
	
				
	
	

}
