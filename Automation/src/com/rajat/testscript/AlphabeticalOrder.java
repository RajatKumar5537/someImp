package com.rajat.testscript;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AlphabeticalOrder {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("file:///D:/Q%20Spider/Selenium/HTML/Hotel.html");
		WebElement mtrListBox = d.findElement(By.id("mtr"));
		ArrayList<String> al=new ArrayList<>();
		Select s= new Select(mtrListBox);
		List<WebElement> allOption = s.getOptions();
		for (int i=0; i<allOption.size();i++) {
			String text = allOption.get(i).getText();
			al.add(text);
		}
		Collections.sort(al);

		for (String e:al) {
			System.out.println(e);
		}

	}
}
