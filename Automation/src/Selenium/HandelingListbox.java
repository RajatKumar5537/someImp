package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandelingListbox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
		public static void main(String[] args) {
			WebDriver d=new ChromeDriver();
			d.get("https://www.facebook.com/");
			d.findElement(By.linkText("Create new account")).click();
			WebElement monthList = d.findElement(By.id("month"));
			Select s=new Select(monthList);
			s.selectByIndex(9);
			s.selectByValue("2");
			s.selectByVisibleText("dec");
			d.close();
	}

}
