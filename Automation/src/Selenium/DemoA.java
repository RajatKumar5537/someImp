package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoA {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		System.setProperty("webdriver.msedge.driver","./driver/msedgedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:/www.google.com");
		String title=driver.getTitle();
		System.out.println(title);
		driver.close();
		WebDriver d1 = new FirefoxDriver();
		driver.manage().window().maximize();
		d1.get("https:/www.facebook.com");
		String title1=d1.getTitle();
		System.out.println(title1);
		d1.close();
	}
}
