package com.swarna.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class withoutClose {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
}
public static void main(String[] args) {
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.manage().deleteAllCookies();
	d.quit();
}
}
