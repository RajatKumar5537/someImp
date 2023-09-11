package com.actitimeProject.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.google.com/");
		Thread.sleep(500);
		d.navigate().to("https://myaccount.google.com/");
		Thread.sleep(500);
		d.navigate().back();
		Thread.sleep(500);
		d.navigate().refresh();
		Thread.sleep(500);
		d.quit();
		
	}

}
