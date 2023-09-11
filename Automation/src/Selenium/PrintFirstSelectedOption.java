package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintFirstSelectedOption {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
	WebDriver d=new ChromeDriver();
	d.get("file:///D:/Q%20Spider/Selenium/Hotel.html");
	WebElement slvListbox=d.findElement(By.id("slv"));
	Select s=new Select(slvListbox);
	WebElement fsOption = s.getFirstSelectedOption();
	String text = fsOption.getText();
	System.out.println(text);
	d.close();
}
}