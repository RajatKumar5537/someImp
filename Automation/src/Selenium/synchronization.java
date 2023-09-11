package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class synchronization {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
	WebDriver d=new ChromeDriver();
	d.get("https://demo.actitime.com/login.do");
	d.findElement(By.id("username")).sendKeys("admin");
	d.findElement(By.name("pwd")).sendKeys("manager");
	d.findElement(By.xpath("//div[text()='Login ']")).click();
	Thread.sleep(5000);
	d.findElement(By.id("logoutLink")).click();
	d.close();
	}
}
