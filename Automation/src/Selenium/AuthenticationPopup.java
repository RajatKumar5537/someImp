package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopup {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
	WebDriver d=new ChromeDriver();
	Thread.sleep(2000);
	d.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	d.close();
	}

}
