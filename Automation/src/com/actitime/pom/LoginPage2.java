package com.actitime.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class LoginPage2 {

	@FindBy(id="username")
	private WebElement untbx;
	
	@FindBy(name="pwd")
	private WebElement pwtbx;
	
	@FindBy(xpath = "//div[.='Login ']")
	private WebElement lgBtn;
	@Test
	public void setLogin(String un, String pw) {
		untbx.sendKeys(un);
		pwtbx.sendKeys(pw);
		lgBtn.click();
	}
}
