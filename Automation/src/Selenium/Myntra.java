package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("https://www.myntra.com/");
		d.findElement(By.xpath("(//a[contains(text(),'Men')])[1]")).click();
		//d.close();
	}

}
