package Selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class pib {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver d=new ChromeDriver(option);
		d.get("https://pib.gov.in/indexd.aspx");
		JavascriptExecutor j=(JavascriptExecutor)d;
		j.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		j.executeScript("window.scrollTo(0,0)");
	}

}
