package com.Flipkart.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties property;
	public ReadConfig() {
		File srcFilePath = new File("./Configuration/config.properties");
		try {
			FileInputStream fis = new FileInputStream(srcFilePath);
			property = new Properties();
			property.load(fis);
		} catch(Exception e) {
			System.out.println("Exception is: " + e.getMessage());
		}
	}
	
	public String getApplicationURL() {
		String url = property.getProperty("baseURL");
		return url;
	}
	
	public String getUserName() {
		String username = property.getProperty("username");
		return username;
	}
	
	public String getPassword() {
		String password = property.getProperty("password");
		return password;
	}
}