package com.rajat.testscript;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandelingListBox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("https://en-gb.facebook.com/");
		d.findElement(By.linkText("Create new account")).click();
		d.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Rajat");
		d.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Kumar");
		d.findElement(By.xpath("(//input[@data-type='text'])[3]")).sendKeys("8763892398");
		d.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("kumarrajat");
		WebElement monthListBox = d.findElement(By.id("month"));
		WebElement dayListBox = d.findElement(By.name("birthday_day"));
		WebElement yearListBox =d.findElement(By.name("birthday_year"));
		Select m=new Select(monthListBox);
		Select d1=new Select(dayListBox);
		Select y=new Select(yearListBox);
		d1.selectByIndex(19);
		m.selectByIndex(2);
		y.selectByValue("1997");
		d.findElement(By.xpath("//label[text()='Male']")).click();
		d.findElement(By.name("websubmit")).click();
		d.close();
	}
}
