package com.rajat.testscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MOuseHover {
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
	WebElement phNo = d.findElement(By.xpath("//p[contains(text(),'Bengaluru')]/../p[2]"));
	System.out.println(phNo);
	d.close();
}
}
