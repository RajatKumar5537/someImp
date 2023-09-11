package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllOptonsWithoutLoop {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("file:///D:/Q%20Spider/Selenium/Hotel.html");
		WebElement mtrListBox = d.findElement(By.id("mtr"));
		Select s = new Select(mtrListBox);
		String text = s.getWrappedElement().getText();
		System.out.println(text);
		d.close();
	}
}