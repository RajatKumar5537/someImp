package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class TestModuleCls {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public void validLogin() {
		WebDriver d=new ChromeDriver();
		d.get("https://demo.actitime.com/login.do");
		LoginPage2 l1=new LoginPage2();
		PageFactory.initElements(d, l1);
		l1.setLogin("admin", "manager");
	}
}
