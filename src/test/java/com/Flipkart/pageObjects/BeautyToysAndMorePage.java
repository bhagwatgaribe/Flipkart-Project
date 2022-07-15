package com.Flipkart.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BeautyToysAndMorePage {
	
	WebDriver ldriver;
	public BeautyToysAndMorePage(WebDriver rdriver) {
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "(//img[@alt='Beauty, Toys & More'])")
	@CacheLookup
	WebElement txtBeautyToys;
	
	@FindBy(linkText = ("Toys & School Supplies"))
	@CacheLookup
	WebElement txtToysAndSchoolSupplies;
	
	public WebElement clickonBeautyandToys() {		
		return txtBeautyToys;
	}
	
	public void ClickonToysAndSchoolSupplies() {
		txtToysAndSchoolSupplies.click();
	}
}