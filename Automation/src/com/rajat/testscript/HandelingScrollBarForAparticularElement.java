package com.rajat.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelingScrollBarForAparticularElement {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver d=new ChromeDriver();
	d.get("https://www.bbc.com/");
	int y = d.findElement(By.xpath("//span[text()='Future Planet']")).getLocation().getY();
	JavascriptExecutor j=(JavascriptExecutor) d;
	j.executeScript("window.scrollBy(0,"+y+")");
	Thread.sleep(1000);
	d.quit();
}
}
