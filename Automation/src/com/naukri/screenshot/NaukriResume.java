package com.naukri.screenshot;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriResume {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d.get("https://www.naukri.com/");
		d.findElement(By.xpath("//a[text()='Login']")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("kumarrajatpradhan5364@gmail.com");
		d.findElement(By.xpath("(//input[@type='password'])")).sendKeys("Rajat@5364");
		d.findElement(By.xpath("//button[text()='Login']")).click();
		d.findElement(By.partialLinkText("View")).click();
		//d.findElement(By.className("uploadCont"));
		d.findElement(By.id("attachCV")).click();
		/*d.get("D:\\noukri");
		File f=new File("D:\\noukri.Rajat Kumar Pradhan.pdf");
		String abp = f.getAbsolutePath();
		//d.findElement(By.id("attachCV")).sendKeys(abp);*/

	}
}