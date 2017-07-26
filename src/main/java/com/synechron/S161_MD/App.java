package com.synechron.S161_MD;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class App 
{
    public static void main( String[] args ) throws InterruptedException, IOException
    {
       LaunchApp();
    }
    public static void LaunchApp () throws InterruptedException, IOException {
    	WebDriver driver;
    	Map<String, Object> prefs = new HashMap<String, Object>();
        
        // Set the notification setting it will override the default setting
    	prefs.put("profile.default_content_setting_values.notifications", 2);
    	
    	ChromeOptions options = new ChromeOptions();
    	options.setExperimentalOption("prefs", prefs);
    	System.setProperty("webdriver.chrome.driver","C:\\SeleniumDrivers\\Chromedriver25\\chromedriver.exe" );
    	driver = new ChromeDriver(options);
    	
    	/*driver.get("http://www.redbus.com/");
    	driver.findElement(By.xpath("//*[@id='stay']")).click();
    	String title = driver.getTitle();
    	System.out.println(title);
    	//driver.manage().window().maximize();
    	driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div[1]/a/div[2]")).click();
    	System.out.println("INDIA");
    	
    	Set <String> window = driver.getWindowHandles();    
    	for(String win : window)
    	{	driver.switchTo().window(win);
    		System.out.println(win);
    		String newwin = driver.getTitle();
    		if (newwin.contains("Önline")){
    			System.out.println(newwin);
    			driver.manage().window().maximize();
    			break;
    			
    		}
    	}
    	//Select sel = new Select (driver.findElement(By.id("src")));
    	driver.findElement(By.id("src")).sendKeys("Pune");
    	driver.findElement(By.id("dest")).sendKeys("Mumbai");
    	driver.findElement(By.xpath("//*[@id='search']/div/div[3]/div/label")).click();
    	driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[7]/td[2]")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.id("src")).click();
    	driver.findElement(By.id("dest")).click();
    	driver.findElement(By.xpath("//*[@id='search_btn']")).click();
    	
    	System.out.println(driver.getTitle());
    	Thread.sleep(10000);
    	System.out.println("test finished");*/
    	
    	
    	/*==========================================
    	 * Amazon site
    	 ===========================================*/
    	 driver.get("http://www.amazon.in/");
    	 //driver.manage().window().maximize();
    	 WebElement element = driver.findElement(By.xpath("//*[@id='nav-logo']/a[2]"));
    	 String text = element.getText();
    	 
    	 System.out.println(text);
    	 
    	 Actions action = new Actions(driver);
    	 action.moveToElement(element).build().perform();
    	 
    	 action.moveToElement(driver.findElement(By.xpath("//*[@id='nav-prime-tooltip']"))).click().build().perform();
    	 String tooltip = driver.findElement(By.xpath("//*[@id='nav-prime-tooltip']/div")).getText();
    	 System.out.println(tooltip);
    	 
    	 File ts = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    	 FileUtils.copyFile(ts, new File("C:\\Users\\Admin\\Documents\\abc.jpeg"));
    	 System.out.println("test over");
    	
    }
}
