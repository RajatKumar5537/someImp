package com.actitimeProject.testscript;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllLinks {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		System.out.println("Enter the URL ");
		Scanner sc=new Scanner(System.in);
		String url = sc.nextLine();
		WebDriver d=new ChromeDriver();
		d.get(url);
		List<WebElement> allLinks = d.findElements(By.xpath("//a"));
		int count = allLinks.size();
		System.out.println("All Links count is "+count);
		
		for(int i=0;i<count;i++) {
			String text = allLinks.get(i).getText();
			System.out.println(text);
		}
		d.close();
	}
}
