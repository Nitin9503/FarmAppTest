package com.farm.qa.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.farm.qa.base.TestBase;

import io.appium.java_client.TouchAction;

public class FarmAppTest extends TestBase {

	@Test(priority = 0)
	public void access_Weather_Details() {

		// Update popup
		WebElement cancle_btn = driver.findElement(By.id("button2"));
		cancle_btn.click();
		WebElement select_lang = driver.findElement(By.xpath("//android.widget.TextView[@text='English']"));
		select_lang.click();
		WebElement procees_btn = driver.findElement(By.id("btn_Proceed"));
		procees_btn.click();
		WebElement agree_btn = driver.findElement(By.id("btn_agree"));
		agree_btn.click();
		// Five time clicks on Home Screen
		for (int i = 0; i < 5; i++) {
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			WebElement click_On_screen = driver.findElement(By.id("content_box"));
			click_On_screen.click();
		}

		WebElement check_Weather_View_btn = driver.findElement(By.id("checkWeatherView"));
		check_Weather_View_btn.click();

		 String wheather_page_title = driver.findElement(By.id("weather_toolBar_Title")).getText();
		 System.out.println(wheather_page_title);
			if (wheather_page_title.equalsIgnoreCase("Weather")) {
				System.out.println("We are on Weather window ");
			} else {

				System.out.println("We are not on Weather window ");
			}	
			
			//scrolling	from Now to 11 AM	
			System.out.println("Now Scrolling ");			
			Dimension size = driver.findElement(By.id("com.climate.farmrise:id/hourlyWeatherForecastScrollView")).getSize();
			System.out.println("size==>" +size);
			int x1 = (int) (size.width * 0.05);
			int x2 = (int) (size.width * 0.95);
			TouchAction action = new TouchAction(driver);
			WebElement element = (WebElement)driver.findElements(By.id("com.climate.farmrise:id/hourlyWeatherForecastScrollView")).get(0);
			for (int i=0; i<5; i++)
			{
			action.longPress(element).moveTo(x1, 875).release().perform();
			try{
			String time_text = driver.findElement(By.xpath("//android.widget.TextView[@text='11 AM']")).getText();
			System.out.println(time_text);
			if (time_text.equalsIgnoreCase("11 AM")){
			
				System.out.println("Time is displayed(11 AM)");
				break;
			}
			}catch(Exception e){
				
				System.out.println("Time is not displayed");
			}
			System.out.println("Scrolling done");
		}
					
	}

	
	
	@Test(priority = 1)
	public void goverment_Scheme() {

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		WebElement more_btn = driver.findElement(By.xpath("//android.widget.TextView[@text='More']"));
		more_btn.click();
		WebElement governmentschemes_btn = driver
				.findElement(By.xpath("//android.widget.TextView[@text='Government Schemes']"));
		governmentschemes_btn.click();

		String title_of_page = driver.findElement(By.id("com.climate.farmrise:id/toolBar_Title")).getText();
		System.out.println(title_of_page);

		if (title_of_page.equalsIgnoreCase("Government Schemes")) {
			System.out.println("We are on Government Schemes window ");
		} else {

			System.out.println("We are not on Government Schemes window ");
		}

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		String sorry_txt = driver.findElement(By.id("com.climate.farmrise:id/sorry_txt")).getText();
		System.out.println(sorry_txt);
		String no_scheme_msg = driver.findElement(By.id("com.climate.farmrise:id/no_content_desc")).getText();
		System.out.println(no_scheme_msg);

	}
	
	@Test(priority = 2)
	public void chat_test() {
		
		WebElement chat_btn =driver.findElement(By.xpath("//android.widget.TextView[@text='Chat']"));
		chat_btn.click();
		String title_of_page = driver.findElement(By.id("com.climate.farmrise:id/screenTitle")).getText();
		System.out.println(title_of_page);

		if (title_of_page.equalsIgnoreCase("Verify your Mobile Number")) {
			System.out.println("We are on Chat window ");
		} else {

			System.out.println("We are not on Chat window ");
		}
		WebElement enter_mobile_number = driver.findElement(By.id("et_phoneNumber"));
		enter_mobile_number.sendKeys("21232121");
		enter_mobile_number.clear();
		
		enter_mobile_number.sendKeys("9552619077");
		
		
	/*	com.climate.farmrise:id/dialog_message
		com.climate.farmrise:id/left_button
		com.climate.farmrise:id/right_button



		com.climate.farmrise:id/btn_proceed*/
		
	}
	
	
	
	
	
	
	
	/*
	 * 
	 * 
	 * WebElement cotton_crop_btn =
	 * driver.findElement(By.xpath("//android.widget.TextView[@text='Cotton']"))
	 * ; cotton_crop_btn.click(); driver.findElement(By.id("btn_Done")).click();
	 * 
	 * com.climate.farmrise:id/weather_toolBar_Title
	 * 
	 * WebElement btn_allow_proceed =
	 * driver.findElement(By.id("btn_allow_proceed"));
	 * btn_allow_proceed.click();
	 * 
	 * try{
	 * 
	 * driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS); String
	 * title = driver.findElement(By.id(
	 * "com.android.packageinstaller:id/permission_message")).getText();
	 * 
	 * 
	 * System.out.println(title); if (driver.findElement(By.id(
	 * "com.android.packageinstaller:id/permission_message")).isDisplayed()) {
	 * System.out.println("Permission popup is displayed");
	 * 
	 * WebElement permission_btn = driver.findElement(By.id(
	 * "com.android.packageinstaller:id/permission_message"));
	 * permission_btn.click(); permission_btn.click();
	 * 
	 * } }catch (Exception e) {
	 * 
	 * System.out.println("Permission popup is not displayed");
	 * 
	 * }
	 * 
	 * 
	 * 
	 * WebElement chat_btn
	 * =driver.findElement(By.xpath("//android.widget.TextView[@text='Chat']"));
	 * 
	 * WebElement agronomy_btn =driver.findElement(By.xpath(
	 * "//android.widget.TextView[@text='Agronomy']"));
	 * 
	 * 
	 * WebElement mandi_btn
	 * =driver.findElement(By.xpath("//android.widget.TextView[@text='Mandi']"))
	 * ;
	 * 
	 * 
	 * String morepage_title =
	 * driver.findElement(By.id("moreMenu_toolBar_Title")).getText();
	 * 
	 * WebElement cotton_btn
	 * =driver.findElement(By.xpath("//android.widget.TextView[@text='Cotton']")
	 * );
	 * 
	 * 
	 * WebElement weather_btn = driver.findElement(By.id("more_weather"));
	 * 
	 * 
	 * 
	 */

	// android.widget.TextView =

	// after selecting crop procees butn = btn_Done = id
	// allo and proceed btn = btn_allow_proceed = id

	// permission allow button = permission_allow_button = id

}
