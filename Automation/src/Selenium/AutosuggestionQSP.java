package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestionQSP {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver w=new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://www.google.com/");
		w.findElement(By.name("q")).sendKeys("qspider");
		Thread.sleep(2000);
		List<WebElement> allSuggesion = w.findElements(By.xpath("//span[contains(text(),'qspider')]"));
		int count = allSuggesion.size();
		System.out.println(count);
		for (int i = 0; i < count; i++) {
			String text = allSuggesion.get(i).getText();
			System.out.println(text);
		}
		allSuggesion.get(count-1).click();
		Thread.sleep(2000);
		//w.close();
	}

}
