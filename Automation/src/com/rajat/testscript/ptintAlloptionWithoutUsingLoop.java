package com.rajat.testscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ptintAlloptionWithoutUsingLoop {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("file:///D:/Q%20Spider/Selenium/HTML/Hotel.html");
		WebElement allOptions = d.findElement(By.id("mtr"));
		Select s=new Select(allOptions);
		String option = s.getWrappedElement().getText();
		System.out.println(option);
		d.close();
	}
}
