   package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitWait {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
	WebDriver d=new ChromeDriver();
	d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	d.get("https://demo.actitime.com/login.do");
	d.findElement(By.id("username")).sendKeys("admin");
	d.findElement(By.name("pwd")).sendKeys("manager");
	d.findElement(By.xpath("//div[text()='Login ']")).click();
	d.findElement(By.id("logoutLink")).click();
	d.close();
	}

}
