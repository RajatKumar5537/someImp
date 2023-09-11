package com.rajat.testscript;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertPopUp {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver d=new ChromeDriver();
	d.get("https://demo.automationtesting.in/Alerts.html");
	d.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
	//d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebDriverWait eb=new WebDriverWait(d, 10);
	eb.until(ExpectedConditions.alertIsPresent());
	Alert a=d.switchTo().alert();
	String text = a.getText();
	System.out.println(text);
}
}
