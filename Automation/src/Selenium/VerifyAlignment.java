package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyAlignment {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demo.actitime.com/login.do");
		int x1 = d.findElement(By.id("username")).getLocation().getX();
		int y1 = d.findElement(By.name("pwd")).getLocation().getY();
		if (x1==y1) {
			System.out.println("username and password textbox are properly aligned and pass");
		} else {
			System.out.println("username and password textbox are not properly aligned and fail");
		}
		d.close();
	}
}