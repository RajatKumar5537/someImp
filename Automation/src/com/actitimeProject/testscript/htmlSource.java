package com.actitimeProject.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class htmlSource {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
	}
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("https://www.selenium.dev/downloads/");
		String htmlCoce = d.getPageSource();
		System.out.println(htmlCoce);
		d.close();
	}
}
