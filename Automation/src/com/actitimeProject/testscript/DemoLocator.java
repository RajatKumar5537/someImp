package com.actitimeProject.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLocator {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
	}
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("file:///D:/Q%20Spider/Selenium/HTML/locator.html");
		d.findElement(By.tagName("a")).click();
		d.navigate().back();
		d.findElement(By.id("d1")).click();
		d.navigate().back();
		d.findElement(By.name("n1")).click();
		d.navigate().back();
		d.findElement(By.className("c1")).click();
		d.navigate().back();
		d.findElement(By.linkText("Google")).click();
		d.quit();
	}
}