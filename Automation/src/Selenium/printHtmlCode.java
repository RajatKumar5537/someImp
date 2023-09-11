package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class printHtmlCode {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver w= new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://www.selenium.dev/downloads/");
		String htmlCode=w.getPageSource();
		System.out.println(htmlCode);
		w.quit();
	}
}
