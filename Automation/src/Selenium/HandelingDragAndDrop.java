package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandelingDragAndDrop {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
	WebDriver d=new ChromeDriver();
	d.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
	WebElement src = d.findElement(By.xpath("//h1[text()='Block 1']"));
	WebElement dest = d.findElement(By.xpath("//h1[text()='Block 4']"));
	Actions a = new Actions(d);
	a.dragAndDrop(src, dest).perform();
	d.close();
	}

}
