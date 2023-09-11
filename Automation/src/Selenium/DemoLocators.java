package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLocators {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("file:///D:/Q%20Spider/Selenium/locator.html");
		driver.findElement(By.tagName("a")).click();
		driver.navigate().back();
		driver.findElement(By.id("d1")).click();
		driver.navigate().back();
		driver.findElement(By.name("n1")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.className("c1")).click();
		driver.close();
		
	}

}
