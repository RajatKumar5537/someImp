package com.swarna.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParticularLocation {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("https://www.bbc.com/");
		int y = d.findElement(By.xpath("//span[contains(text(),'Editor’s Picks')]")).getLocation().getY();
		JavascriptExecutor j=(JavascriptExecutor) d;
		j.executeScript("window.scrollBy(0,"+y+")");
		d.close();
		
}
}