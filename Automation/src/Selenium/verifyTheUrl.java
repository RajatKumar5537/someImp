package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifyTheUrl {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver w= new ChromeDriver();
		w.get("https://www.selenium.dev/downloads/");
		String expectedUrl="https://www.selenium.dev/downloads/";
		String actualUrl=w.getCurrentUrl();
		if (expectedUrl.equals(actualUrl)) {
			System.out.println("URL is successfully navigating and pass");
		}
		else {
			System.out.println("URL is not successfully navigating and fail");
		}
		w.quit();
	}
}
