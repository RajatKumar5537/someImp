package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		ChromeDriver d= new ChromeDriver();
		d.get("https://www.google.com/");
		d.navigate().to("https://mail.google.com/mail/u/0/#inbox");
		d.navigate().back();
		d.navigate().forward();
		d.navigate().refresh();
		d.quit();		
	}
}
