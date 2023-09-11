package com.actitimeProject.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(id="logoutLink")
	private WebElement lgOut;
	
	@FindBy(xpath="//div[text()='Tasks']")
	private WebElement tasksTab;
	
	public HomePage(WebDriver d) {
		PageFactory.initElements(d, this);
	}
	public void setLogout() {
		lgOut.click();
	}
	public void setTaskTab() {
		tasksTab.click();
	}

}
