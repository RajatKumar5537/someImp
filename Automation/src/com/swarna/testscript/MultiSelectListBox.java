package com.swarna.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectListBox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("file:///D:/Q%20Spider/Selenium/HTML/Hotel.html");
		WebElement mtrListBox = d.findElement(By.id("mtr"));
		Select s=new Select(mtrListBox);
		Thread.sleep(2000);
		s.selectByIndex(0);
		s.selectByValue("v");
		s.selectByVisibleText("dosa");
		
		s.selectByIndex(2);
		s.selectByValue("d");
		s.selectByVisibleText("idly");
		boolean status = s.isMultiple();
		System.out.println(status);
		d.close();
}
}