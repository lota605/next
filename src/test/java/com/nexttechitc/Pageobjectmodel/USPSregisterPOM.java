package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class USPSregisterPOM {

	WebDriver driver;
	
	 public  USPSregisterPOM (WebDriver driver) {
	     this.driver=driver;
	     PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(id="login-register-header")
	 WebElement click_Register ;
	 public WebElement Register() {
		 return click_Register;
	 }
	 @FindBy(id="sign-up-button")
	WebElement click_signupnow ;
	 public WebElement SignUpNow() {
		 return click_signupnow;
	 
	
	 
	 }
	 @FindBy(id="slanguage")
	 WebElement language;
	 public WebElement Click_English() {
		 return language;
	 }
	 @FindBy(id="tuserName")
	 WebElement type_username;
	 public WebElement Username () {
		 return type_username;
	 
}
	 @FindBy(id="tPassword")
	 WebElement type_password;
	 public WebElement Password () {
		 return type_password;
	 }
	 @FindBy(id="tPasswordRetype")
	 WebElement type_retypepassword;
	 public WebElement ReTypepassword () {
		 return type_retypepassword;
	 }
	 @FindBy(xpath="//*[@id=\"ssec1\"]")
	 WebElement First_question;
	 public WebElement FirstQuestion () {
		 return First_question;
	 
	 }
	 @FindBy(xpath="//*[@id=\"tsecAnswer1\"]")
	 WebElement type_answer;
	 public WebElement TypeAnswer1  () {
		 return type_answer;
	 }
	 @FindBy(id="tsecAnswer1Match")
	 WebElement type_retypeanswer;
	 public WebElement ReTypeAnswer1  () {
		 return type_retypeanswer;
	 }
	 @FindBy(id="ssec2")
	 WebElement second_question;
	 public WebElement SecondQuestion () {
		 return second_question;
	 }
	 @FindBy(id="tsecAnswer2")
	 WebElement type_answer2;
	 public WebElement TypeAnswer2  () {
		 return type_answer2;
	 }
	 @FindBy(id="tsecAnswer2Match")
	 WebElement type_retypeanswer2;
	 public WebElement ReTypeyAnswer2 () {
		 return type_retypeanswer2;
	 }
	 @FindBy(id="rAccount1")
	 WebElement click_personalaccount;
	 public WebElement PersonalAccount() {
		 return click_personalaccount;
	 }
	 @FindBy(id="tfName")
	 WebElement type_firstname;
	 public WebElement FirstName() {
		 return type_firstname;
	 }
	 @FindBy(id="tlName")
	 WebElement type_lastname;
	 public WebElement LastName () {
		 return type_lastname;
	 }
	 @FindBy(id="temail")
	 WebElement type_email;
	 public WebElement EmailAddress() {
		 return type_email;
	 }
	 @FindBy(id="temailRetype")
	 WebElement type_retypeemail;
	 public WebElement RetypeEmail() {
		 return type_retypeemail;
	 }
	 @FindBy(id="sphoneType")
	 WebElement seclect_US;
	 public WebElement US() {
		 return seclect_US;
	 }
	 @FindBy(id="tphone")
	 WebElement type_phone;
	 public WebElement Phone() {
		 return type_phone;
	 }
	 @FindBy(id="scountry")
	 WebElement seclect_country;
	 public WebElement Country() {
		 return seclect_country;
	 }
	 @FindBy(id="taddress")
	 WebElement type_steetaddress;
	 public WebElement SteetAddress() {
		 return type_steetaddress;
	 }
	 @FindBy(id="tapt")
	 WebElement type_apt;
	 public WebElement Apt() {
		 return type_apt;
	 }
	 @FindBy(id="tcity")
	 WebElement type_city;
	 public WebElement City() {
		 return type_city;
	 }
	 @FindBy(id="sstate")
	 WebElement seclect_state;
	 public WebElement State() {
		 return seclect_state;
	 }
	 @FindBy(id="tzip")
	 WebElement type_zipcode;
	 public WebElement ZipCode() {
		 return type_zipcode;
	 }
	 @FindBy(id="a-address-step1")
	 WebElement click_verifyaddress;
	 public WebElement VerifyAddress() {
		 return click_verifyaddress;
	 }
	 @FindBy(id="btn-submit")
	 WebElement click_createaccount;
	 public WebElement CreateAccount() {
		 return click_createaccount;
	 }
	 
	 
	
	 
	 
	 
	 

	 

}
