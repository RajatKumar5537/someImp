package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class withoutClose {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver w=new ChromeDriver();
		w.manage().window().maximize();
		Thread.sleep(2000);
		w.manage().deleteAllCookies();
		w.quit();
	}
}
