package com.goat.base;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class CommonMethods extends PageInitializer{
	
	public static void sendText(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);
	}
	
	public static WebDriverWait getWaitObject() {
		WebDriverWait wait = new WebDriverWait(driver, Constants.EXPLICIT_WAIT_TIME);
		return wait;
	}
	
	public static WebElement waitForClickability(WebElement element) {
		return getWaitObject().until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public static void click(WebElement element) {
		waitForClickability(element);
		element.click();
	}
	public static byte[] takeScreenshot(String filename) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		byte[] picBytes=ts.getScreenshotAs(OutputType.BYTES);
		
		File file = ts.getScreenshotAs(OutputType.FILE);
		String destinationFile=Constants.SCREENSHOT_FILEPATH+filename+".png";
		
		try {
			FileUtils.copyFile(file, new File(destinationFile));
		} catch (Exception ex) {
			System.out.println("Cannot take screenshot!");
		}
		return picBytes;
	}
	
	public static void wait(int second) {
		try {
			Thread.sleep(second * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static JavascriptExecutor getJSObject() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		return js;
	}
	public static void jsClick(WebElement element) {
		getJSObject().executeScript("arguments[0].click();", element);
	}
}
