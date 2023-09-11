package com.rajat.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoAssertion {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	@Test
	public void verifytitle() {
		WebDriver d= new ChromeDriver();
		d.get("https://www.google.com/");
		String aTitle = d.getTitle();
		String exTitle="Sgoole";
		Assert.assertEquals(aTitle, exTitle);
		d.close();
	}
}
