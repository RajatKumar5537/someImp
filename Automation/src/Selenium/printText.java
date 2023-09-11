package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class printText {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demo.actitime.com/login.do");
		String text = d.findElement(By.id("toPasswordRecoveryPageLink")).getText();
		System.out.println(text);
		d.close();
	}
}
