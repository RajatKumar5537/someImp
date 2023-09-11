package com.swarna.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyAllign {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver d= new ChromeDriver();
		d.get("https://demo.actitime.com/login.do");
		int x1 = d.findElement(By.name("username")).getLocation().getX();
		int x2 = d.findElement(By.name("pwd")).getLocation().getX();
		if(x1==x2) {
			System.out.println("Username and Password textbox are properly alligned and pass");
		}
		else {
			System.out.println("Username and Password textbox are not properly alligned and fail");
		}
		System.out.println("Height of UN  = "+x1);
		System.out.println("Height of PWD = "+x2);
		System.out.println();

		int y1 = d.findElement(By.name("username")).getLocation().getY();
		int y2 = d.findElement(By.name("pwd")).getLocation().getY();
		if(y1==y2) {
			System.out.println("Username and Password textbox are properly alligned and pass");
		}
		else {
			System.out.println("Username and Password textbox are not properly alligned and fail");
		}
		System.out.println("Width of UN  = "+y1);
		System.out.println("Width of PWD = "+y2);
		d.close();
	}
}
