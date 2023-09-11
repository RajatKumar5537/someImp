package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectListBox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
	WebDriver d=new ChromeDriver();
	d.get("file:///D:/Q%20Spider/Selenium/Hotel.html");
	WebElement mtrListbox=d.findElement(By.id("mtr"));
	Select s=new Select(mtrListbox);
	Thread.sleep(1000);
	s.selectByIndex(0);
	s.selectByVisibleText("dosa");
	s.deselectByIndex(2);
	s.deselectByValue("d");
	s.deselectByVisibleText("dosa");
	boolean status = s.isMultiple();
	System.out.println(status);
	}

}
