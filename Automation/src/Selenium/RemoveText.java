package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RemoveText {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
	WebDriver d= new ChromeDriver();
	d.get("https://opensourcebilling.org/");
	d.findElement(By.id("Browser")).clear();
	d.close();
	
	}

}
