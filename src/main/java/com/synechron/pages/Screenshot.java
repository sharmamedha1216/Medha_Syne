package com.synechron.pages;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot{
	static WebDriver driver;
	public static void getScreenprint() throws IOException {
		
		File ts = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ts, new File("C:\\Users\\Medha.Sharma\\Documents\\doc.png"));
		
		
	}
	
}