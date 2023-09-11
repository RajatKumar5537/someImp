package com.swarna.testscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver d=new ChromeDriver();
	d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	d.get("https://www.vtiger.com/");
	WebElement target = d.findElement(By.partialLinkText("Resources"));
	Actions a=new Actions(d);
	a.moveToElement(target).perform();
	d.findElement(By.partialLinkText("Contact Us")).click();
	String phNo = d.findElement(By.xpath("//p[contains(text(),'United Kingdom,')]/../p[2]")).getText();
	System.out.println(phNo);
	d.close();
}
}
