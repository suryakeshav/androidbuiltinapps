package com.appium.mobile.androidbuiltinapps;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class SetAlarmTest {

@Test
	
	public void testAlarmSet() throws Exception{
		
DesiredCapabilities capabilities = new DesiredCapabilities();
		
		capabilities.setCapability("automationName", "Appium");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "6.0.1");
		capabilities.setCapability("deviceName", "Moto G (3rd generation)");
		
		//Alarm/Clock App
		
		capabilities.setCapability("appPackage", "com.android.deskclock");
		capabilities.setCapability("appActivity", "HandleSetApiCalls");
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		//Click on create Alarm
		
		driver.findElement(By.id("com.google.android.deskclock:id/fab")).click();
		
		//Set the hour to 6
		
		while(!((WebElement) driver.findElements(By.id("com.sec.android.app.clockpackage:id/timepicker_input")).get(0)).getText().equals("6")){

			((WebElement) driver.findElements(By.id("com.sec.android.app.clockpackage:id/increment")).get(0)).click();

			}

			//Set the Minute to 00

			while(!((WebElement) driver.findElements(By.id("com.sec.android.app.clockpackage:id/timepicker_input")).get(1)).getText().equals("00")){

			((WebElement) driver.findElements(By.id("com.sec.android.app.clockpackage:id/increment")).get(1)).click();

			}

			//Set AM

			if(driver.findElement(By.id("com.sec.android.app.clockpackage:id/alarm_ampm_button")).getText().equals("PM")){

			driver.findElement(By.id("com.sec.android.app.clockpackage:id/alarm_ampm_button")).click();

			}

			//Set the day to Monday

			driver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.widget.ToggleButton\").description(\"Monday\")").click();

			//Save the Alarm

			driver.findElement(By.id("com.sec.android.app.clockpackage:id/menu_done")).click();

			}

}

			 