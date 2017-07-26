package com.synechron.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchBrowserApp {
	static WebDriver driver;
	public static void launchapp(String BrowserName, String url){
		
		if(BrowserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("WebDriver.chrome,driver","");
			driver = new ChromeDriver();
		}
		
		else if(BrowserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("WebDriver.gecko,driver","");
			driver = new FirefoxDriver();
		}
		
		else if (BrowserName.equalsIgnoreCase("ie")) 
		{
			System.setProperty("WebDriver.ie,driver","");
			driver = new InternetExplorerDriver();
		}
		
		else {
			System.out.println("Try with another Browser");
		}
		
		driver.get(url);
	}

}
