package com.Flipkart.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Flipkart.Base.BaseClass;
import com.Flipkart.pageObjects.MenuPage;
import com.Flipkart.utilities.Screenshot;

public class TC_004_BecomeSellerTest extends BaseClass{
	
	@Test
	private void BecomeSellerTest() throws InterruptedException, IOException {
		
		driver.get(baseURL);
		logger.info("URL is opened.");
		
		MenuPage mp = new MenuPage(driver);
		Screenshot ss = new Screenshot();
		
		Thread.sleep(1000);
		mp.clickonClosebtn();
		logger.info("Login closed");
		
		mp.ClickonBecomeSeller();
		logger.info("Become a seller page opened successfully");
		Thread.sleep(1000);
		
		if (driver.getTitle().equals("Sell Online on Flipkart | Grow your business with the leader in Indian e-commerce")) {
			Assert.assertTrue(true);
			logger.info("Become seller test case passed");
		}
		else
		{
			Assert.assertTrue(false);
			ss.CaptureScreen(driver, "BecomeSellerTest");
			logger.info("Become seller test case failed");
			
		}
	}
}
