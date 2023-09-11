package com.actitimeProject.testscript;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPropertyFile {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws IOException {
	FileInputStream fis= new FileInputStream("./data/commondata.property");
	Properties p=new Properties();
	p.load(fis);
	String url = p.getProperty("url");
	String un = p.getProperty("username");
	String pwd = p.getProperty("password");
	System.out.println(url);
	System.out.println(un);
	System.out.println(pwd);
	WebDriver d=new ChromeDriver();
	d.get(url);
	d.findElement(By.id("username")).sendKeys(un);
	d.findElement(By.name("pwd")).sendKeys(pwd);
	d.findElement(By.xpath("//div[text()='Login ']")).click();
	//d.close();
	
	}
}
