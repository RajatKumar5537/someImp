package com.actitime.testscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseDemoClass {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public WebDriver d;
@BeforeClass
public void openBrowser() {
	Reporter.log("Open Browser",true);
	d=new ChromeDriver();
	d.get("https://demo.actitime.com/");
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
@AfterClass
public void closeBrowser() {
	Reporter.log("Close Browser",true );
	d.close();
}
@BeforeMethod
public void login() {
	Reporter.log("Login",true);
	d.findElement(By.xpath("//a[text()='Logout']")).click();
	d.findElement(By.id("username")).sendKeys("admin");
	d.findElement(By.name("pwd")).sendKeys("manager");
	d.findElement(By.xpath("//div[text()='Login ']")).click();
}
@AfterClass
public void logout() {
	Reporter.log("Logout",true);
	d.findElement(By.id("logoutLink")).click();
	d.close();
}
}
