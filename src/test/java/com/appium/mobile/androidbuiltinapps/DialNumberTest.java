package com.appium.mobile.androidbuiltinapps;

import java.net.URL;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class DialNumberTest {
	
	@Test
	
	public void testDialNumber() throws Exception{
		
DesiredCapabilities capabilities = new DesiredCapabilities();
		
		capabilities.setCapability("automationName", "Appium");
		capabilities.setCapability("platformName", System.getProperty("PlatformName"));
		capabilities.setCapability("platformVersion", System.getProperty("PlatformVersion"));
		capabilities.setCapability("deviceName", "Moto G (3rd generation)");
		capabilities.setCapability("appPackage", "com.android.dialer");
		capabilities.setCapability("appActivity", "DialtactsActivity");
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		//Phone Number
		
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the Phone Number to Dial");
	int phonenumber = input.nextInt();
	
	LinkedList<Integer> stack=new LinkedList<Integer>();
	
	while(phonenumber>0) {
		stack.push(phonenumber%10);
		phonenumber=phonenumber/10;
	}
	
	while(!stack.isEmpty()) {
		
			switch (stack.pop()) {
			case 1:
				driver.findElement(By.id("com.android.dialer:id/one")).click();
				break;
				
			case 2:
				driver.findElement(By.id("com.android.dialer:id/two")).click();
				break;
			case 3:
				driver.findElement(By.id("com.android.dialer:id/three")).click();
				break;
			case 4:
				driver.findElement(By.id("com.android.dialer:id/four")).click();
				break;
			case 5:
				driver.findElement(By.id("com.android.dialer:id/five")).click();
				break;
			case 6:
				driver.findElement(By.id("com.android.dialer:id/six")).click();
				break;
			case 7:
				driver.findElement(By.id("com.android.dialer:id/six")).click();
				break;
			
			case 8:
				driver.findElement(By.id("com.android.dialer:id/eight")).click();
				break;
			case 9:
				driver.findElement(By.id("com.android.dialer:id/nine")).click();
				break;
			case 0:
				driver.findElement(By.id("com.android.dialer:id/zero")).click();
				break;
				
				default:
					break;
		}
				
	}
	
	driver.findElement(By.id("com.android.dialer:id/dialpad_floating_action_button")).click();
	driver.quit();
				
	}
	
	
}
