package com.Flipkart.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver) {
		ldriver =  rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(xpath = "(.//input[@type='text' and @class='_2IX_2- VJZDxU'])")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy(xpath = "(.//input[@type='password'])")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(xpath = "(.//button[@type='submit' and @class='_2KpZ6l _2HKlqd _3AWRsL'])")
	@CacheLookup
	WebElement btnLogin;
	
	@FindBy(className = "exehdJ")
	@CacheLookup
	WebElement txtusername;
	
	@FindBy(linkText = ("Logout"))
	@CacheLookup
	WebElement txtLogout;
	
	public void setUserName(String uname) {
		txtUserName.sendKeys(uname);
	}
	
	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);
	}
	
	public void clickSubmit() {
		btnLogin.click();
	}
	
	public WebElement clickonUser() {
		return txtusername;
	}
	
	public void clickLogout() {
		txtLogout.click();
	}
}