package com.swarna.testscript;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingScrollBar {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver d=new ChromeDriver();
	d.get("https://www.bbc.com/");
	JavascriptExecutor j=(JavascriptExecutor) d;
	j.executeScript("window.scrollBy(0,3000)");
	d.close();
}
}
