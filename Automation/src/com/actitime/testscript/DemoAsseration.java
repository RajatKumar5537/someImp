package com.actitime.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoAsseration {
	static {
		System.setProperty("webdriver.chromer.driver", "./driver/chromedriver.exe");
	}
	@Test
	public void verifyTitle() {
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.com/");
		String eTitle="Soogle";
		String aTitle = d.getTitle();
		Assert.assertEquals(aTitle, eTitle);
		d.close();
	}
}
