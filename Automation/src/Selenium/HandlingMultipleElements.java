package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class HandlingMultipleElements {
	
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver w=new ChromeDriver();
		w.get("file:///D:/WebElement/Selenium/qsp.html	");
		List<WebElement> allLinks=w.findElements(By.tagName("a"));
		int count = allLinks.size();
		System.out.println(count);
		WebElement link=allLinks.get(0);
		String text = link.getText();
		System.out.println(text);
		w.close();
	}

}
