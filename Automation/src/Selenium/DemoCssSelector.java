package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoCssSelector {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("C:\\Users\\Rajat\\eclipse-workspace\\Automation\\data\\locator.html");
		d.findElement(By.cssSelector("a[id='d1']")).click();
		d.navigate().back();
		d.findElement(By.cssSelector("a[name='n1']")).click();
		d.navigate().back();
		d.findElement(By.cssSelector("a[class='c1']")).click();
		d.navigate().back();
		d.findElement(By.cssSelector("a[href='https://www.google.com/']")).click();
		d.close();
	}
}
