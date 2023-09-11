package Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAllWithourQuit {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://secure.indeed.com/");
		d.findElement(By.id("apple-signin-button")).click();
		d.findElement(By.id("login-facebook-button")).click();
		Set<String> allwh = d.getWindowHandles();
		for(String wh:allwh) {
			d.switchTo().window(wh);
			d.close();
		}

	}

}
