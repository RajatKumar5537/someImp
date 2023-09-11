package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTimeOut {
	static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
		try {
			d.get("https://demo.actitime.com/login.do");
			System.out.println("Page is loaded within 5 seconds and Pass");
		}
		catch (Exception e) {
		System.out.println("Page is not loaded within 5 seconds and Fail");
		}
		d.close();
	}
}
