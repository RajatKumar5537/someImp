package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxInActitime {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		d.get("https://demo.actitime.com/login.do");
		WebElement checkBox = d.findElement(By.id("keepLoggedInCheckBox"));
		if (checkBox.isSelected()) {
			System.out.println("Check Box is selected by default");
		}
		else
			System.out.println("Check Box is not selected by default");
		d.close();
	}

}
