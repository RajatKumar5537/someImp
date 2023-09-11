package com.swarna.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAllOptionWithoutLoop {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver d=new ChromeDriver();
	d.get("file:///D:/Q%20Spider/Selenium/HTML/Hotel.html");
	WebElement slvListBox = d.findElement(By.id("slv"));
	Select s=new Select(slvListBox);
	String text = s.getWrappedElement().getText();
	System.out.println(text);
	d.close();
}
}
