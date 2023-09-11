package com.actitime.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class DemoAssertion1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public void verifyTitle() {
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.com/");
		String eTitle = "Soggle";
		String aTitle = d.getTitle();
		SoftAssert s=new SoftAssert();
		s.assertEquals(aTitle, eTitle);
		d.close();
		s.assertAll();
	}
}
