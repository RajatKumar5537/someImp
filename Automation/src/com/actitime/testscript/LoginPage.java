package com.actitime.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	final WebElement untbx;
	final WebElement pwtbx;
	final WebElement lgbtn;

	public LoginPage(WebDriver d) {
		untbx=d.findElement(By.id("username"));
		pwtbx=d.findElement(By.name("pwd"));
		lgbtn=d.findElement(By.xpath("//div[.='Login ']"));
	}
	public void setLogin(String un,String pw ) {
		untbx.sendKeys(un);
		pwtbx.sendKeys(pw);
		lgbtn.click();
	}

}
