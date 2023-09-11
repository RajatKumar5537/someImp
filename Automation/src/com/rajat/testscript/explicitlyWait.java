package com.rajat.testscript;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitlyWait {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws IOException {
		FileInputStream fis= new FileInputStream("./data/commondata.property");
		Properties p=new Properties();
		p.load(fis);
		String url = p.getProperty("url");
		String un = p.getProperty("username");
		String pwd = p.getProperty("password");
		WebDriver d=new ChromeDriver();
		d.get(url);
		d.findElement(By.id("username")).sendKeys(un);
		d.findElement(By.name("pwd")).sendKeys(pwd);
		d.findElement(By.xpath("//div[text()='Login ']")).click();
		WebDriverWait wait= new WebDriverWait(d, 10);
		wait.until(ExpectedConditions.titleContains("Enter"));
		String title = d.getTitle();
		System.out.println(title);
		d.close();
	}
}
