package com.Flipkart.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Flipkart.Base.BaseClass;
import com.Flipkart.pageObjects.MenuPage;
import com.Flipkart.utilities.Screenshot;


public class TC_003_CartTest extends BaseClass{

	@Test
	public void CartTest() throws IOException, InterruptedException {
		driver.get(baseURL);
		logger.info("URL is opened.");
		
		MenuPage mp = new MenuPage(driver);
		Screenshot ss = new Screenshot();
		
		Thread.sleep(3000);
		mp.clickonClosebtn();
		logger.info("Login closed");
		
		mp.clickonCart();
		logger.info("Cart page opened successfully..!");
		Thread.sleep(2000);		
		
		if (driver.getTitle().equals("Shopping Cart | Flipkart.com")) {
			Assert.assertTrue(true);
			logger.info("Cart test passed");
		}
		else
		{
			ss.CaptureScreen(driver, "CartTest");
			Assert.assertTrue(false);
			logger.info("Cart test failed");
		}
	}
}
