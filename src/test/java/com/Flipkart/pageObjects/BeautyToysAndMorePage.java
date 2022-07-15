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
	
	@FindBy(linkText = ("Sports Toys"))
	@CacheLookup
	WebElement txtSportToys;
	
	@FindBy(linkText =("KRISHNA VERMICOMPOST Football"))
	@CacheLookup
	WebElement txtFootball;
	
	@FindBy(xpath = "(//button[normalize-space()='Add to Cart'])[1]")
	@CacheLookup
	WebElement txtAddToCart;
	
	@FindBy(xpath = ("//div[contains(text(),'My Cart (1)')]"))
	@CacheLookup
	WebElement txtCartText;
	
	
	public WebElement clickonBeautyandToys() {		
		return txtBeautyToys;
	}
	
	public void ClickonToysAndSchoolSupplies() {
		txtToysAndSchoolSupplies.click();
	}
	
	public void ClickonSportToyes() {
		txtSportToys.click();
	}
	
	public void ClickonFootballItem() {
		txtFootball.click();
	}
	
	public void ClickonAddToCart() {
		txtAddToCart.click();
	}
	
	public void getCartText() {
		txtCartText.getText();
	}
}	