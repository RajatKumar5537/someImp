package Selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllLinks {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver w=new ChromeDriver();
		w.get("//www.qspiders.com/");
		List<WebElement> allLinks=w.findElements(By.xpath("//a"));
		int count=allLinks.size();
		System.out.println(count);
		for (int i=0;i<count;i++) {
			Object text = allLinks.get(i).getText();
			System.out.println(text);
		}
		w.close();
	}

}
