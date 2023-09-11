package Selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleingScrollBar {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
	WebDriver d=new ChromeDriver();
	d.get("https://www.bbc.com/");
	JavascriptExecutor j=(JavascriptExecutor)d;
	j.executeScript("window.scrollBy(0,3000)");
	//window.scrollTo(0,0)
	}

}
