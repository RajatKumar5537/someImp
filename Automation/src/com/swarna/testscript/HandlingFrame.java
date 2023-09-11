package com.swarna.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrame {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver d= new ChromeDriver();
	d.get("file:///D:/Q%20Spider/Selenium/HTML/page1.html");
	d.findElement(By.id("t1")).sendKeys("Rajat");
	d.switchTo().frame("f1");
	d.findElement(By.id("t2")).sendKeys("Swarna");
	
	d.switchTo().defaultContent();
	d.findElement(By.id("t1")).sendKeys("Swarna");
	WebElement f = d.findElement(By.xpath("//iframe"));
	d.switchTo().frame(f);
	d.findElement(By.id("t2")).sendKeys("Rajat");
	d.close();
}
}
