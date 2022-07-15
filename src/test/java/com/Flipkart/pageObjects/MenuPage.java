package com.Flipkart.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuPage {
	
	WebDriver ldriver;
	 public MenuPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	 @FindBy(xpath = "(//span[contains(text(),'Cart')])")
	 @CacheLookup
	 WebElement linkCart;
	 
	 @FindBy(xpath = "//button[contains(text(),'✕')]")
	 @CacheLookup
	 WebElement btnClose;
	 
	 public void clickonCart() {
		linkCart.click();
	}

	public void clickonClosebtn() {
		btnClose.click();
	}
	
	@FindBy(xpath = "(//span[contains(text(),'Become a Seller')][1])")
	@CacheLookup
	WebElement linkBecomeSeller;
	
	public void ClickonBecomeSeller() {
		linkBecomeSeller.click();
	}
}
