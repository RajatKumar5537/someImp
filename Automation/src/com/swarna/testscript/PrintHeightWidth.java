package com.swarna.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintHeightWidth {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();

		d.get("https://en-gb.facebook.com/");
		WebElement login = d.findElement(By.name("login"));
		int height = login.getSize().getHeight();
		int width = login.getSize().getWidth();
		System.out.println("Facebook Login logo height & widhth");
		System.out.println("Height = "+height);
		System.out.println("Width = "+ width);

		d.navigate().back();
		Thread.sleep(1000);
		d.navigate().refresh();

		d.get("https://demo.actitime.com/login.do");
		WebElement actiLogin = d.findElement(By.xpath("//div[text()='Login ']"));
		int height1 = actiLogin.getSize().getHeight();
		int width1 = actiLogin.getSize().getWidth();
		System.out.println("ActiTime Login logo height & widhth");
		System.out.println("Height = "+ height1);
		System.out.println("Width = "+ width1);

		Thread.sleep(1000);
		d.navigate().refresh();
		d.close();

	}
}
