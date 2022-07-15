package com.Flipkart.testCases;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Flipkart.Base.BaseClass;
import com.Flipkart.pageObjects.BeautyToysAndMorePage;
import com.Flipkart.pageObjects.LoginPage;
import com.Flipkart.utilities.Screenshot;

public class TC_005_SelectToyTest extends BaseClass{

	@Test
	private void SelectToyTest() throws InterruptedException, IOException {
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
		
		Thread.sleep(2000);
		btm.ClickonSportToyes();
		logger.info("Sport toy's selected");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		
		btm.ClickonFootballItem();
		logger.info("Football item selected");
		
		String mainWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		Iterator<String> iterator = allWindows.iterator();
		
		while (iterator.hasNext()) {
			String childWindow = iterator.next();
			if (!mainWindow.equalsIgnoreCase(childWindow)) {
				driver.switchTo().window(childWindow);
				btm.ClickonAddToCart();
				logger.info("Item added in Cart");
				
				btm.getCartText();
				logger.info("Cart text fached successfully");
				
				if (driver.getTitle().equals("Shopping Cart | Flipkart.com")) {
					Assert.assertTrue(true);
					logger.info("Select toy test passed");
				}
				else
				{
					ss.CaptureScreen(driver, "CartTest");
					Assert.assertTrue(false);
					logger.info("Select toy test failed");
				}
				driver.close();
			}
		}
		driver.switchTo().window(mainWindow);
	}
}
