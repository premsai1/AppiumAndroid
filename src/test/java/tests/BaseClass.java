package tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

/**
 * @author bridglabz
 *
 */ 
public class BaseClass {

	static AppiumDriver<MobileElement> driver;

	@BeforeTest
	public void setup() throws MalformedURLException {

		try {
			// Capabilities of Emulator
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Google Pixel 2");
			cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.0.0");
			cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
			cap.setCapability("appPackage", "com.android.calculator2");
			cap.setCapability("appActivity", "com.android.calculator2.Calculator");

			/*
			 * cap.setCapability(MobileCapabilityType.APP, "");
			 * cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
			 * cap.setCapability("session-override","true");
			 * cap.setCapability("autoGrantPermissions", "true");
			 */
			


			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			driver = new AppiumDriver<MobileElement>(url, cap);
			/*
			 * driver = new AndroidDriver<MobileElement>(url, cap); driver = new
			 * IOSDriver<MobileElement>(url, cap);
			 */
		} catch (Exception exp)

		{
			System.out.println("Cause is:" + exp.getCause());
			System.out.println("Message is  :" + exp.getMessage());
			exp.printStackTrace();
		}

	}

	@Test
	public void sampleTest() {
		System.out.println("-------------------This is just a sample test ---------------");
	}

	@AfterTest
	public void teardown() {
		driver.close();
		driver.quit();
	}

}
