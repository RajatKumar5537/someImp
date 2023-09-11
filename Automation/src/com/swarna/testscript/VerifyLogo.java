package com.swarna.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLogo {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver d=new ChromeDriver();
	d.get("https://en-gb.facebook.com/");
	boolean logo = d.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();
	if (logo==true) {
		System.out.println("Logo is displayed and pass");
	}
	else {
		System.out.println("Logo is not displayed and fail");
	}
	d.close();
}
}
