package com.rajatpracticeTestNG.testscript;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CustomerModule {

	@Test
	public void createCustomer() {
		Reporter.log("Create Customer",true);
	}
	
	@Test
	public void deleteCustomer() {
		Reporter.log("Delete Customer",true);
	}
	@BeforeMethod
	public void login() {
		Reporter.log("Login",true);
	}
	@AfterMethod
	public void logout() {
		Reporter.log("Logout",true);
	}
	@BeforeClass
	public void openBrowser () {
		Reporter.log("Open Browser",true);
	}
	@AfterClass
	public void closeBrowser() {
		Reporter.log("Close Browser",true);
	}
}
