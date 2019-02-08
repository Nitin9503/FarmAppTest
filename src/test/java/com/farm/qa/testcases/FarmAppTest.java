package com.farm.qa.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.farm.qa.base.TestBase;
import com.farm.qa.utility.TestUtil;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidKeyCode;

public class FarmAppTest extends TestBase {

	@Test(priority = 0)
	public void access_Weather_Details() {
		// Weather details scenario
	
		WebElement check_Weather_View_click = driver.findElement(By.id("checkWeatherView"));
		check_Weather_View_click.click();
		String weather_page_title = driver.findElement(By.id("weather_toolBar_Title")).getText();
		Assert.assertEquals(weather_page_title, "Weather",
				"Weather tab window is not displayed upon clicking on Check Weather button from home window");
		System.out.println(weather_page_title);
		for (int i = 0; i < 7; i++) {
			try {
				if (driver.findElement(By.xpath("//android.widget.LinearLayout[@index='22']")).isDisplayed()) {
					System.out.println("23 hours time colomn is displayed");
					String time_text = driver
							.findElement(By
									.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[3]/android.widget.HorizontalScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[11]/android.widget.TextView[1]"))
							.getText();
					System.out.println("TIme is ==>" + time_text);
					break;
				}
			} catch (Exception e) {
				System.out.println("23 hours time colomn is not displayed");

			}

			// scrolling from Now to 11 AM
			System.out.println("Now Scrolling ");
			Dimension size = driver.findElement(By.id("com.climate.farmrise:id/hourlyWeatherForecastScrollView"))
					.getSize();
			System.out.println("size==>" + size);
			int x1 = (int) (size.width * 0.05);
			int x2 = (int) (size.width * 0.95);
			TouchAction action = new TouchAction(driver);
			WebElement element = (WebElement) driver
					.findElements(By.id("com.climate.farmrise:id/hourlyWeatherForecastScrollView")).get(0);
			action.longPress(element).moveTo(x1, 875).release().perform();
			System.out.println("Scrolling done");
		}

	}

	@Test(priority = 1)
	public void goverment_Scheme() {
		// Government schemes scenario
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		WebElement more_click = driver.findElement(By.xpath("//android.widget.TextView[@text='More']"));
		more_click.click();
		String more_page_title = driver.findElement(By.xpath("//android.widget.TextView[@text='More']")).getText();
		System.out.println("more_page_title==>" + more_page_title);
		Assert.assertEquals(more_page_title, "More", "More tab window is not displayed upon clicking on More button");
		WebElement governmentschemes_click = driver
				.findElement(By.xpath("//android.widget.TextView[@text='Government Schemes']"));
		governmentschemes_click.click();
		String title_of_page = driver.findElement(By.id("com.climate.farmrise:id/toolBar_Title")).getText();
		System.out.println("title_of_page" + title_of_page);
		Assert.assertEquals(title_of_page, "Government Schemes",
				"Government Schemes window is not displayed upon clicking on Government Schemes button");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		/*
		 * String sorry_txt =
		 * driver.findElement(By.id("com.climate.farmrise:id/sorry_txt")).
		 * getText(); System.out.println("sorry_txt==>" + sorry_txt); String
		 * no_scheme_msg =
		 * driver.findElement(By.id("com.climate.farmrise:id/no_content_desc")).
		 * getText(); System.out.println("no_scheme_msg==>" + no_scheme_msg);
		 */
		for (int i = 0; i < 5; i++) {
		
			TestUtil.scrollUp((WebElement) driver.findElements(By.id("com.climate.farmrise:id/recyclerView")).get(0), driver.findElement(By.id("com.climate.farmrise:id/recyclerView")).getSize(), 0.80, 0.20, 2);

		}

	}

	@Test(priority = 2)
	public void chat_test() {
		// max chat process or automated or extra scenario
		WebElement chat_click = driver.findElement(By.xpath("//android.widget.TextView[@text='Chat']"));
		chat_click.click();
		String title_of_page = driver.findElement(By.id("com.climate.farmrise:id/screenTitle")).getText();
		System.out.println(title_of_page);
		Assert.assertEquals(title_of_page, "Verify your Mobile Number",
				"Chat window is not displayed upon clicking on Chat button");
		WebElement enter_mobile_number = driver.findElement(By.id("et_phoneNumber"));
		WebElement proceed_click = driver.findElement(By.id("btn_proceed"));
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
		proceed_click.click();
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
		proceed_click.click();
		driver.findElement(By.id("right_button")).click();

		try {
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			String title = driver.findElement(By.id("com.android.packageinstaller:id/permission_message")).getText();
			System.out.println(title);
			if (driver.findElement(By.id("com.android.packageinstaller:id/permission_message")).isDisplayed()) {
				System.out.println("Permission popup is displayed for Message sending");
				WebElement permission_click = driver
						.findElement(By.id("com.android.packageinstaller:id/permission_allow_button"));
				permission_click.click();
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
		WebElement verify_click = driver.findElement(By.id("btn_verify"));
		verify_click.click();
		String wrong_otp_popup = driver.findElement(By.id("com.climate.farmrise:id/dialog_title")).getText();
		Assert.assertEquals(wrong_otp_popup, "Wrong OTP",
				"Wrong OTP popup is not displayed upon entering invalid OTP ");
		driver.findElement(By.id("right_button")).click();
		driver.findElement(By.id("btn_back")).click();
		driver.pressKeyCode(AndroidKeyCode.BACK);
		System.out.println("code ended");

	}

	@Test(priority = 3)
	public void test_all_tabs() throws InterruptedException {
		// Smoke Test extra scenario String home_btn
		Thread.sleep(8000);

		System.out.println("Home tab");
		driver.findElement(By.xpath("//android.widget.TextView[@text='Home']")).click();
		String home_page_title = driver.findElement(By.xpath("//android.widget.TextView[@text='Home']")).getText();
		Assert.assertEquals(home_page_title, "Home", "Home page window is not displayed upon clicking on Home button");

		System.out.println("Mandi tab");
		driver.findElement(By.xpath("//android.widget.TextView[@text='Mandi']")).click();
		String mandi_page_title = driver.findElement(By.xpath("//android.widget.TextView[@text='Mandi Prices']"))
				.getText();
		Assert.assertEquals(mandi_page_title, "Mandi Prices",
				"Home page window is not displayed upon clicking on Home button");

		System.out.println("Agronomy tab");
	
		driver.findElement(By.xpath("//android.widget.TextView[@text='Agronomy']")).click();
		Thread.sleep(800);
		String agronomy_page_title = driver.findElement(By.xpath("//android.widget.TextView[@text='Agronomy']"))
				.getText();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Assert.assertEquals(agronomy_page_title, "Agronomy",
				"Agronomy page window is not displayed upon clicking on Agronomy button");

		System.out.println("Chat tab");
		driver.findElement(By.xpath("//android.widget.TextView[@text='Chat']")).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		String chat_page_title = driver
				.findElement(By.xpath("//android.widget.TextView[@text='Verify your Mobile Number']")).getText();
		Assert.assertEquals(chat_page_title, "Verify your Mobile Number",
				"Verify your Mobile Number page window is not displayed upon clicking on Chat button");
		driver.pressKeyCode(AndroidKeyCode.BACK);
		driver.pressKeyCode(AndroidKeyCode.BACK);
		System.out.println("More tab");
		driver.findElement(By.xpath("//android.widget.TextView[@text='More']")).click();
		String more_page_title = driver.findElement(By.xpath("//android.widget.TextView[@text='More']")).getText();
		Assert.assertEquals(more_page_title, "More", "More page window is not displayed upon clicking on More button");

	}

	@Test(priority = 4)
	public void settings_tab() throws InterruptedException {
		// Notification tab
		WebElement more_click = driver.findElement(By.xpath("//android.widget.TextView[@text='More']"));
		more_click.click();
		WebElement settings_click = driver.findElement(By.xpath("//android.widget.TextView[@text='Settings']"));
		settings_click.click();
		String setting_page_title = driver.findElement(By.xpath("//android.widget.TextView[@text='Settings']"))
				.getText();
		System.out.println("setting_page_title==>" + setting_page_title);
		Assert.assertEquals(setting_page_title, "Settings",
				"Settings window is not displayed upon clicking on Settings button");
		WebElement notification_click = driver.findElement(By.id("notifyPreference"));
		notification_click.click();
		Thread.sleep(8000);
		String notification_page_tiitle = driver
				.findElement(By.xpath("//android.widget.TextView[@text='Notification Preferences']")).getText();
		System.out.println("notification_page_tiitle==>" + notification_page_tiitle);
		Assert.assertEquals(notification_page_tiitle, "Notification Preferences",
				"Notification Preferences window is not displayed upon clicking on Notification Preferences button");
		WebElement switchNotification_radio_click = driver
				.findElement(By.id("com.climate.farmrise:id/switchNotification"));
		switchNotification_radio_click.click();
		System.out.println("code ended");
	}

	
	@Test(priority = 5)
	public void agronomy_test() {

		WebElement agronomy_click = driver.findElement(By.xpath("//android.widget.TextView[@text='Agronomy']"));
		agronomy_click.click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		String agronomy_page_title = driver.findElement(By.xpath("//android.widget.TextView[@text='Agronomy']"))
				.getText();
		Assert.assertEquals(agronomy_page_title, "Agronomy",
				"Agronomy page window is not displayed upon clicking on Agronomy button");
		WebElement onion_click = driver.findElement(By.xpath("//android.widget.TextView[@text='Onion']"));
		onion_click.click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		String onion_page_title = driver.findElement(By.id("com.climate.farmrise:id/agronomy_toolBar_Title")).getText();
		Assert.assertEquals(onion_page_title, "Agronomic Advisory",
				"Onion page window is not displayed upon clicking on Onion click");
		WebElement planting_click = driver.findElement(By.xpath("//android.widget.TextView[@text='Planting']"));
		planting_click.click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		String planting_page_title = driver.findElement(By.xpath("//android.widget.TextView[@text='Planting']"))
				.getText();
		Assert.assertEquals(planting_page_title, "Planting",
				"Planting page window is not displayed upon clicking on Planting click");

		for (int i = 0; i < 10; i++) {
			try {
				String Irrigation_text = driver.findElement(By.xpath("//android.widget.TextView[@text='Irrigation']"))
						.getText();
				System.out.println("Scrolling Ended");
				if (Irrigation_text.equalsIgnoreCase("Irrigation")) {

					System.out.println("Irrigation tab is displayed");
					break;
				}
			} catch (Exception e) {

				System.out.println("Irrigation tab not is displayed");
			}
			System.out.println("Scrolling started");
			
			TestUtil.scrollUp((WebElement) driver.findElements(By.id("com.climate.farmrise:id/subStageNestedScrollView")).get(0), driver.findElement(By.id("com.climate.farmrise:id/subStageNestedScrollView")).getSize(), 0.80, 0.20, 2);

			
		}

	}

}
