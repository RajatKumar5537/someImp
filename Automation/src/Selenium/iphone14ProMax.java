package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iphone14ProMax {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		d.findElement(By.xpath("(//button)[2]")).click();
		d.findElement(By.name("q")).sendKeys("APPLE iPhone 14 Pro Max");
		Thread.sleep(2000);
		List<WebElement> allSug = d.findElements(By.xpath("//div[contains(text(),'apple iphone 14 pro max')]"));
		int count = allSug.size();
		System.out.println("Search Content count is -: "+count);
		System.out.println();
		for (int i=0;i<count;i++) {
			String text = allSug.get(i).getText();
			System.out.println(text);
		}
		/*for (WebElement allOption:allSug) {
			System.out.println(allOption.getTagName());
		}*/
		d.close();
	}

}
