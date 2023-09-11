package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestMethodCls {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@Test
	public void validLogin() {
		WebDriver d=new ChromeDriver();
		d.get("https://demo.actitime.com/login.do");
		LoginPage l=new LoginPage(d);
		l.setLogin("admin", "manager");
	}
}
