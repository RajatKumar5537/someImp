package com.swarna.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RemoveText {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver d=new ChromeDriver();
	d.get("https://en-gb.facebook.com/");
	d.findElement(By.xpath("//a[text()='Forgotten password?']"));
}
}
