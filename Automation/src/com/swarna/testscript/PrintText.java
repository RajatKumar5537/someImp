package com.swarna.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintText {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("https://demo.actitime.com/login.do");
		String text = d.findElement(By.id("toPasswordRecoveryPageLink")).getText();
		String partialLinkText = d.findElement(By.partialLinkText("Forgot your password?")).getText();
		String tagName1 = d.findElement(By.tagName("a")).getText();
		System.out.println(text);
		System.out.println(partialLinkText);
		System.out.println(tagName1);
		d.close();
	}
}
