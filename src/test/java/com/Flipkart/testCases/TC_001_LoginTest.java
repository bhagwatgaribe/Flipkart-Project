package com.Flipkart.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Flipkart.Base.BaseClass;
import com.Flipkart.pageObjects.LoginPage;
import com.Flipkart.utilities.Screenshot;

public class TC_001_LoginTest extends BaseClass{

	@Test
	public void LoginTest() throws IOException {
		driver.get(baseURL);
		logger.info("URL is opened.");
		
		LoginPage lp = new LoginPage(driver);
		Screenshot ss = new Screenshot();
		
		lp.setUserName(username);
		logger.info("User name is entered");
		
		lp.setPassword(password);
		logger.info("Password is entered");
		
		lp.clickSubmit();
		logger.info("Logged in successfully");
		
		if (driver.getTitle().equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!")) {
			Assert.assertTrue(true);
			logger.info("Login test passed");
		}
		else
		{
			ss.CaptureScreen(driver, "LoginTest");
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}
	}
}