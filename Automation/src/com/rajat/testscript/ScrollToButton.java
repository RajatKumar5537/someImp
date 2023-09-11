package com.rajat.testscript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToButton {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("https://www.bbc.com/");
		JavascriptExecutor j= (JavascriptExecutor) d;
		//Scroll to bottom of the Webpage
		j.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		//Scrool to top of the Webpage 
		j.executeScript("window.scrollTo(0,0)");
		d.close();
	}
}
