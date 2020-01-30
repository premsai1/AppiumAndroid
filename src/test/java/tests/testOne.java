package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;

public class testOne extends BaseClass {

	@Test
	public void testOne() {
		// locators for Calculator Mobile Elements
		MobileElement eight = driver.findElement(By.id("com.android.calculator2:id/digit_8"));
		MobileElement plus = driver.findElement(By.id("com.android.calculator2:id/op_add"));
		MobileElement one = driver.findElement(By.id("com.android.calculator2:id/digit_1"));
		MobileElement two = driver.findElement(By.id("com.android.calculator2:id/digit_2"));
		MobileElement equals = driver.findElement(By.id("com.android.calculator2:id/eq"));
		MobileElement result = driver.findElement(By.id("com.android.calculator2:id/result"));

		// actions on the Mobile Elemment

		eight.click();
		plus.click();
		one.click();
		two.click();
		equals.click();
		System.out.println("Completed Test one");
	}
}
