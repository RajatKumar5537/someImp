package com.rajat.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleingFrame {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver d=new ChromeDriver();
	d.get("file:///D:/Q%20Spider/Selenium/HTML/page1.html");
	d.switchTo().frame(0);
	d.findElement(By.id("t2")).sendKeys("jsp");
	d.switchTo().parentFrame();
	d.findElement(By.id("t1")).sendKeys("qsp");
	Thread.sleep(3000);
	d.close();
}
}
