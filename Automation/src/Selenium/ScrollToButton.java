package Selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollToButton {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
	WebDriver d=new ChromeDriver();
	d.get("https://www.bbc.com/");
	JavascriptExecutor j=(JavascriptExecutor)d;
	/*scroll to bottom of the webpage, 
	 * take below address from bbc.com (inspect then click on console and type there, then enter)*/
	j.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	Thread.sleep(3000);
	j.executeScript("window.scrollTo(0,0)");
	
	}

}
