package com.swarna.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifyURL {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver d=new ChromeDriver();
	d.get("https://www.seleniumhq.org/");
	String eResult="https://www.selenium.dev/";
	String aResult = d.getCurrentUrl();
	if (eResult.equals(aResult)) {
		System.out.println("URL is successful navigating and pass");
	}
	else {
		System.out.println("URL is fail");
	}
	d.close();
}
}
