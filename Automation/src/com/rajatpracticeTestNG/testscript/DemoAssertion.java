package com.rajatpracticeTestNG.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoAssertion {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@Test
	public void verifyTitle() {
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.com/");
		String actualTitle = d.getTitle();
		String expectedTitle = "google";
		Assert.assertEquals(actualTitle, expectedTitle);
		d.close();
	}
}
