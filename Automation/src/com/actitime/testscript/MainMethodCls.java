package com.actitime.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainMethodCls {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver d=new ChromeDriver();
	d.get("https://demo.actitime.com/login.do");
	LoginPage l=new LoginPage(d);
	l.setLogin("admin", "manager");
	//d.close();
}
}
