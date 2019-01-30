package com.farm.qa.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import com.farm.qa.base.TestBase;

import io.appium.java_client.TouchAction;

public class TestUtil extends TestBase {
	
	
	public static void scrollUp(WebElement element, Dimension size, double a, double b, int c){
		System.out.println("Scrolling started");
		System.out.println("Size==>" + size);
		int starty = (int) (size.height * a);
		int endy = (int) (size.height * b);
		int startx = size.width / c;
		TouchAction action = new TouchAction(driver);
		action.longPress(element).moveTo(startx, endy).release().perform();		
		
		
	}

}
