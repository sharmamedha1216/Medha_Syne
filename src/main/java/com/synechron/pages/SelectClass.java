package com.synechron.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void dropDownSelectClass(WebElement element, String Flag, String ValueorVisibleText){
		
		Select  sel = new Select(element);
		if (Flag=="Value")
		{
			sel.selectByValue(ValueorVisibleText);
		}
		else {
			sel.selectByVisibleText(ValueorVisibleText);
		}
	}
	
	public static void dropDownSelectClass(WebElement element, int index ){
				
		Select  sel = new Select(element);
		sel.selectByIndex(index);
	}
}
