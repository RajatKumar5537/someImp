package com.rajatpracticeTestNG.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@Test
	public void verifyTitle() {
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.com/");
		String aTitle = d.getTitle();
		String eTitle = "Soogle";
		SoftAssert s=new SoftAssert();
		s.assertEquals(aTitle, eTitle);
		d.close();
		s.assertAll();
	}
}