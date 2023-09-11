package com.rajat.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HandelingDisableElemnt {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver d=new ChromeDriver();
	d.get("file:///D:/Q%20Spider/Selenium/HTML/disable%20element.html");
	d.findElement(By.id("d1")).sendKeys("admin");
	RemoteWebDriver r=(RemoteWebDriver) d;
	r.executeScript("document.getElementById('d2').value=''");
}
}
