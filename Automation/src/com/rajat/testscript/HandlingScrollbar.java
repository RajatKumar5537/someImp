package com.rajat.testscript;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScrollbar {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("https://www.bbc.com/");
		JavascriptException j=(JavascriptException) d;
		j.executeScript("window.scroolBy(0,3000)");
	}

}
