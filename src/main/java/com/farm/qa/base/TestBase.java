package com.farm.qa.base;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import AppiumSession.StartAppiumServer;
import io.appium.java_client.android.AndroidDriver;

public class TestBase extends StartAppiumServer {
	public static AndroidDriver driver;

	@BeforeTest
	public void app_Launch() throws MalformedURLException, InterruptedException {
	
		//Test App on Android Emulator on Local machine 
		//startServer();
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "Emulator");
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "6.0.0");
		caps.setCapability("newCammandTimeout", "60");
	 	caps.setCapability("fullReset", true);
		caps.setCapability("udid", "192.168.14.101:5555"); 
		caps.setCapability("udid", "192.168.56.101:5555");
	   //caps.setCapability("udid", "B3VNU17914100329");
		//caps.setCapability("app", "E:\\Appium\\apk75\\FarmRise.apk");
		caps.setCapability("appPackage", "com.climate.farmrise");
		caps.setCapability("appActivity", "com.climate.farmrise.SplashScreen");
		Thread.sleep(900);
		try {
			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		} catch (Exception e) {
			driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);
		}
		
		//Test App on Real Device over Sauce lab
		/*DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("testobjectApiKey", "001657E41B8F4783B767469399C8F198");
		caps.setCapability("deviceName", "Motorola Moto E2");
		caps.setCapability("platformVersion", "5.1");
		caps.setCapability("name", "Test on MototDevice");
		caps.setCapability("newCammandTimeout", "150");
	 	caps.setCapability("fullReset", true);
		caps.setCapability("appPackage", "com.climate.farmrise");
		caps.setCapability("appActivity", "com.climate.farmrise.SplashScreen");
		driver = new AndroidDriver(new URL("https://us1.appium.testobject.com/wd/hub"), caps);*/	
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

	}

	@BeforeClass
	public void permission_popup() {
		// we can use boolean true 
		try {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			String title = driver.findElement(By.id("com.android.packageinstaller:id/permission_message")).getText();
			System.out.println(title);
			if (driver.findElement(By.id("com.android.packageinstaller:id/permission_message")).isDisplayed()) {
				System.out.println("Permission popup is displayed");
				WebElement permission_btn = driver
						.findElement(By.id("com.android.packageinstaller:id/permission_message"));
				permission_btn.click();
				permission_btn.click();
			}
		} catch (Exception e) {

			System.out.println("Permission popup is not displayed");

		}
		// Update popup
		/*
		 * WebElement cancle_btn = driver.findElement(By.id("button2"));
		 * cancle_btn.click();
		 */
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

	}

	@AfterTest
	public void tearDown() throws InterruptedException {
	//	stopServer();
	}

}
