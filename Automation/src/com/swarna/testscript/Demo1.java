package com.swarna.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver  d=new ChromeDriver();
	d.get("https://www.google.com/");
	Thread.sleep(2000);
	d.navigate().to("https://www.google.com/");
	Thread.sleep(2000);
	d.navigate().back();
	Thread.sleep(2000);
	d.navigate().forward();
	d.close();
	Thread.sleep(2000);
	d.navigate().refresh();
}
}
