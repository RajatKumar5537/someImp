package com.rajat.testscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllOptionOfSLV {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("file:///D:/Q%20Spider/Selenium/HTML/Hotel.html");
		WebElement slvListBox = d.findElement(By.id("slv"));
		WebElement mtrListBox= d.findElement(By.id("mtr"));
		Select s=new Select(slvListBox);
		Select m=new Select(mtrListBox);
		List<WebElement> allOptions = s.getOptions();
		List<WebElement> mtrOption = m.getOptions();
		System.out.println("SLV List");
		System.out.println();

		for (WebElement option:allOptions) {
			String text = option.getText();
			System.out.println(text);
		}
		System.out.println();
		System.out.println("MTR List");
		System.out.println();

		for (WebElement moption:mtrOption) {
			String text = moption.getText();
			System.out.println(text);
		}
		d.close();
	}
}
