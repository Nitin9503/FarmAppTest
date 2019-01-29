package com.farm.qa.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.farm.qa.base.TestBase;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidKeyCode;

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

		/*
		 * WebElement check_Weather_View_btn =
		 * driver.findElement(By.id("checkWeatherView"));
		 * check_Weather_View_btn.click();
		 * 
		 * String wheather_page_title =
		 * driver.findElement(By.id("weather_toolBar_Title")).getText();
		 * System.out.println(wheather_page_title); if
		 * (wheather_page_title.equalsIgnoreCase("Weather")) {
		 * System.out.println("We are on Weather window "); } else {
		 * 
		 * System.out.println("We are not on Weather window "); }
		 * 
		 * //scrolling from Now to 11 AM System.out.println("Now Scrolling ");
		 * Dimension size = driver.findElement(By.id(
		 * "com.climate.farmrise:id/hourlyWeatherForecastScrollView")).getSize()
		 * ; System.out.println("size==>" +size); int x1 = (int) (size.width *
		 * 0.05); int x2 = (int) (size.width * 0.95); TouchAction action = new
		 * TouchAction(driver); WebElement element =
		 * (WebElement)driver.findElements(By.id(
		 * "com.climate.farmrise:id/hourlyWeatherForecastScrollView")).get(0);
		 * for (int i=0; i<5; i++) { action.longPress(element).moveTo(x1,
		 * 875).release().perform(); try{ String time_text =
		 * driver.findElement(By.
		 * xpath("//android.widget.TextView[@text='11 AM']")).getText();
		 * System.out.println(time_text); if
		 * (time_text.equalsIgnoreCase("11 AM")){
		 * 
		 * System.out.println("Time is displayed(11 AM)"); break; }
		 * }catch(Exception e){
		 * 
		 * System.out.println("Time is not displayed"); }
		 * System.out.println("Scrolling done"); }
		 * 
		 * }
		 */

	}

	@Test(priority = 1)
	public void goverment_Scheme() {

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		WebElement more_btn = driver.findElement(By.xpath("//android.widget.TextView[@text='More']"));
		more_btn.click();
		String more_page_title = more_btn.getText();
		System.out.println(more_page_title);
		Assert.assertEquals(more_page_title, "More", "More tab window is not displayed upon clicking on More button");
		WebElement governmentschemes_btn = driver
				.findElement(By.xpath("//android.widget.TextView[@text='Government Schemes']"));
		governmentschemes_btn.click();
		String title_of_page = driver.findElement(By.id("com.climate.farmrise:id/toolBar_Title")).getText();
		System.out.println(title_of_page);
		Assert.assertEquals(title_of_page, "Government Schemes",
				"Government Schemes window is not displayed upon clicking on Government Schemes button");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		String sorry_txt = driver.findElement(By.id("com.climate.farmrise:id/sorry_txt")).getText();
		System.out.println(sorry_txt);
		String no_scheme_msg = driver.findElement(By.id("com.climate.farmrise:id/no_content_desc")).getText();
		System.out.println(no_scheme_msg);
		if (sorry_txt.equalsIgnoreCase("We're sorry!") && no_scheme_msg.equalsIgnoreCase(
				"We regret to inform you that Government Schemes are unavailable in your region. Watch this space for updates.")) {
			System.out.println("No schemes in your region");
		} else {
			System.out.println("Schemes are available in your region");
		}

	}

	@Test(priority = 2)
	public void chat_test() {

		WebElement chat_btn = driver.findElement(By.xpath("//android.widget.TextView[@text='Chat']"));
		chat_btn.click();
		String title_of_page = driver.findElement(By.id("com.climate.farmrise:id/screenTitle")).getText();
		System.out.println(title_of_page);
		Assert.assertEquals(title_of_page, "Verify your Mobile Number",
				"Chat window is not displayed upon clicking on Chat button");
		WebElement enter_mobile_number = driver.findElement(By.id("et_phoneNumber"));
		WebElement proceed_btn = driver.findElement(By.id("btn_proceed"));
		enter_mobile_number.sendKeys("955261");
		boolean btn_proceed_invalid = driver.findElement(By.id("btn_proceed")).isEnabled();
		System.out.println(btn_proceed_invalid);
		Assert.assertFalse(btn_proceed_invalid, "Proceed button is not disabled upon entering invalid mobile number");
		enter_mobile_number.clear();
		enter_mobile_number.sendKeys("2123212145");
		boolean btn_proceed_valid = driver.findElement(By.id("btn_proceed")).isEnabled();
		System.out.println(btn_proceed_valid);
		Assert.assertTrue(btn_proceed_valid, "Proceed button is not enabled upon entering valid mobile number");
		System.out.println("HERE1");
		proceed_btn.click();
		System.out.println("HERE");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		String number_verify_popup = driver.findElement(By.id("dialog_message")).getText();
		System.out.println("number_verify " + number_verify_popup);
		Assert.assertEquals(number_verify_popup, "Is this mobile number correct?",
				"Chat window is not displayed upon clicking on Chat button");
		driver.findElement(By.id("left_button")).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		enter_mobile_number.clear();
		enter_mobile_number.sendKeys("9552619077");
		proceed_btn.click();
		driver.findElement(By.id("right_button")).click();
		;
		try {
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			String title = driver.findElement(By.id("com.android.packageinstaller:id/permission_message")).getText();
			System.out.println(title);
			if (driver.findElement(By.id("com.android.packageinstaller:id/permission_message")).isDisplayed()) {
				System.out.println("Permission popup is displayed for Message sending");
				WebElement permission_btn = driver
						.findElement(By.id("com.android.packageinstaller:id/permission_allow_button"));
				permission_btn.click();
			}
		} catch (Exception e) {
			System.out.println("Permission popup is not displayed for Message sending");

		}
		String sms_verification_window = driver
				.findElement(By.xpath("//android.widget.TextView[@text='SMS Verification']")).getText();
		Assert.assertEquals(sms_verification_window, "SMS Verification",
				"SMS Verification window is not displayed upon clicking on allow button from permission popup");
		WebElement otp_input_filed = driver.findElement(By.id("et_OTP"));
		otp_input_filed.sendKeys("2233");
		boolean btn_status_invalid = driver.findElement(By.id("btn_verify")).isEnabled();
		System.out.println(btn_status_invalid);
		Assert.assertFalse(btn_status_invalid, "OTP Verify button is not disabled upon entering invalid OTP number");
		otp_input_filed.sendKeys("112233");
		boolean btn_status_valid = driver.findElement(By.id("btn_verify")).isEnabled();
		System.out.println(btn_status_valid);
		Assert.assertTrue(btn_status_valid, "OTP Verify button is not enabled upon entering valid OTP number");
		WebElement verify_btn = driver.findElement(By.id("btn_verify"));
		verify_btn.click();
		String wrong_otp_popup = driver.findElement(By.id("com.climate.farmrise:id/dialog_title")).getText();
		Assert.assertEquals(wrong_otp_popup, "Wrong OTP",
				"Wrong OTP popup is not displayed upon entering invalid OTP ");

		/*
		 * if (wrong_otp_popup.equalsIgnoreCase("Wrong OTP")) {
		 * 
		 * System.out.println("OTP popup is displayed");
		 * driver.findElement(By.id("right_button")).click(); } else {
		 * 
		 * System.out.println("OTP popup is not displayed"); }
		 */

		driver.findElement(By.id("btn_back")).click();
		driver.pressKeyCode(AndroidKeyCode.BACK);
		System.out.println("code ended");

	}

	@Test(priority = 3)
	public void settings_tab() {
		WebElement more_btn = driver.findElement(By.xpath("//android.widget.TextView[@text='More']"));
		more_btn.click();
		WebElement settings_btn = driver.findElement(By.xpath("//android.widget.TextView[@text='Settings']"));
		settings_btn.click();
		String setting_page_title = settings_btn.getText();
		System.out.println(setting_page_title);
		Assert.assertEquals(setting_page_title, "Settings",
				"Settings window is not displayed upon clicking on Settings button");
		WebElement notification_btn = driver.findElement(By.id("notifyPreference"));
		notification_btn.click();
		String notification_page_tiitle = notification_btn.getText();
		System.out.println(notification_page_tiitle);
		Assert.assertEquals(notification_page_tiitle, "Notification Preferences",
				"Notification Preferences window is not displayed upon clicking on Notification Preferences button");
		WebElement switchNotification_radio_btn = driver.findElement(By.id("switchNotification"));
		switchNotification_radio_btn.click();

	}

}

