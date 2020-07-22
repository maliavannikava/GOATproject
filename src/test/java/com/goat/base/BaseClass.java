package com.goat.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {
	
	public static WebDriver driver;
	
	public static void setUp() {
		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "true");
		ConfigsReader.readProperties(Constants.CONFIGURATION_FILEPATH);
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get(ConfigsReader.getProperty("url"));
		PageInitializer.initialize();
	}	
	
	public static void tearDown() {
		if (driver != null) {
			driver.quit();
		}
		//test
	}
}
