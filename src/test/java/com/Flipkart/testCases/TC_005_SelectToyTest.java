package com.Flipkart.testCases;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.Flipkart.Base.BaseClass;
import com.Flipkart.pageObjects.BeautyToysAndMorePage;
import com.Flipkart.pageObjects.LoginPage;
import com.Flipkart.utilities.Screenshot;

public class TC_005_SelectToyTest extends BaseClass{

	@Test
	private void SelectToyTest() throws InterruptedException {
		driver.get(baseURL);
		logger.info("URL is opened.");
		
		LoginPage lp = new LoginPage(driver);
		Screenshot ss = new Screenshot();
		BeautyToysAndMorePage btm = new BeautyToysAndMorePage(driver);
		
		lp.setUserName(username);
		logger.info("User name is entered");
		
		lp.setPassword(password);
		logger.info("Password is entered");
		
		lp.clickSubmit();
		logger.info("Logged in successfully");
		
		Thread.sleep(2000);
		
		Actions action = new Actions(driver);
		action.moveToElement(btm.clickonBeautyandToys()).build().perform();
		logger.info("Clicked on Beauty, Toys and More");
		Thread.sleep(2000);
		
		btm.ClickonToysAndSchoolSupplies();
		logger.info("Clicked on Toys & School Supplies");
		
	}
}
