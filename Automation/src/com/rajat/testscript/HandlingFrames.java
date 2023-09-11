package com.rajat.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver d=new ChromeDriver();
	d.get("file:///D:/Q%20Spider/Selenium/HTML/page1.html");
	d.findElement(By.id("t1")).sendKeys("a");
	d.switchTo().frame("f1");
	d.findElement(By.id("t2")).sendKeys("b");
	d.switchTo().parentFrame();
	d.findElement(By.id("t1")).sendKeys("c");
	d.switchTo().frame("f1");
	d.findElement(By.id("t2")).sendKeys("d");
	
}
}
