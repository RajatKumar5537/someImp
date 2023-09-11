package com.swarna.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintHTMLCode {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("https://www.selenium.dev/");
		String htmlCode = d.getPageSource();
		System.out.println(htmlCode);
		d.quit();
	}
}
