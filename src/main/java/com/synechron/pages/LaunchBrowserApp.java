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
			System.setProperty("webdriver.chrome.driver","C:\\SeleniumDrivers\\Chromedriver25\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if(BrowserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko,driver","");
			driver = new FirefoxDriver();
		}
		
		else if (BrowserName.equalsIgnoreCase("ie")) 
		{
			System.setProperty("webdriver.ie,driver","");
			driver = new InternetExplorerDriver();
		}
		
		else {
			System.out.println("Try with another Browser");
		}
		
		driver.get(url); //http://startoursus.com/India
	}

}
