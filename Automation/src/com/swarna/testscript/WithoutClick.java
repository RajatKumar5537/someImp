package com.swarna.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutClick {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver d=new ChromeDriver();
	d.get("https://en-gb.facebook.com/");
	d.findElement(By.name("login")).submit();
	Thread.sleep(2000);
	d.navigate().back();
	Thread.sleep(1000);
	d.navigate().refresh();
	Thread.sleep(1000);
	d.findElement(By.xpath("//button[text()='Log in']")).submit();
	Thread.sleep(1000);
	d.close();
}
}
