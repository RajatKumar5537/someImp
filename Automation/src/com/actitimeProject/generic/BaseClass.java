package com.actitimeProject.generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.actitimeProject.pom.HomePage;
import com.actitimeProject.pom.LoginPage;

import Selenium.FileLib;

public class BaseClass {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static WebDriver d;

@BeforeTest
public void openBrowesr () {
	Reporter.log("Open Browser",true);
	d=new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

@AfterTest
public void closeBrowser() {
	Reporter.log("Close Browser",true);
	d.close();
}

@BeforeMethod
public void login() throws IOException {
	Reporter.log("Login",true);
	FileLib f=new FileLib();
	String url = f.getPropertyData("url");
	String un = f.getPropertyData("username");
	String pw = f.getPropertyData("passwprd");
	d.get(url);
	LoginPage l=new LoginPage(d);
	l.setLogin(un, pw);
}

@AfterMethod
public void logout() {
	Reporter.log("Logout",true);
	HomePage h=new HomePage(d);
	h.setLogout();
	
}
}
