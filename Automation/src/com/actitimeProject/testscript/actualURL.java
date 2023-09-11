package com.actitimeProject.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class actualURL {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
	}
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("https://www.seleniumhq.org/");
		String acData = "https://www.selenium.dev/";
		String exData = d.getCurrentUrl();
		if (acData.equals(exData)) {
			System.out.println("URL is same");
		}
		else {
			System.out.println("URL is not same");
		}
		d.quit();
	}
}
