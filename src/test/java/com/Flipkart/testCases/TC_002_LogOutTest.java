package com.Flipkart.testCases;

import java.io.IOException;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Flipkart.Base.BaseClass;
import com.Flipkart.pageObjects.LoginPage;
import com.Flipkart.utilities.Screenshot;

public class TC_002_LogOutTest extends BaseClass{
	
	@Test()
	private void LogoutTest() throws IOException, InterruptedException {
		driver.get(baseURL);
		logger.info("URL is opened.");
		
		LoginPage lp = new LoginPage(driver);
		Screenshot ss = new Screenshot();
		Actions action = new Actions(driver);
		
		lp.setUserName(username);
		logger.info("User name is entered");
		
		lp.setPassword(password);
		logger.info("Password is entered");
		
		lp.clickSubmit();
		logger.info("Logged in successfully");
		
		Thread.sleep(3000);
		action.moveToElement(lp.clickonUser()).build().perform();
		logger.info("Clicked on user profile");
		
		Thread.sleep(3000);
		lp.clickLogout();
		logger.info("Clicked on logout");
		
		if (driver.getTitle().equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!")) {
			Assert.assertTrue(true);
			logger.info("Logout test passed");
		}
		else
		{
			ss.CaptureScreen(driver, "LogoutTest");
			Assert.assertTrue(false);
			logger.info("Logout test failed");
		}
	}
}