package com.swarna.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CustomerModule {

	@Test(priority = 1, invocationCount = 3)
	public void createCustomer() {
		Reporter.log("Create Customer", true);
	}
	@Test(priority = 2, dependsOnMethods = "CreateCustomer")
	public void modifyCustomer() {
		Reporter.log("Modify Customer", true);
	}
	@Test(priority=3,dependsOnMethods = {"createCustome","modifyCustomer"})
	public void deleteCustomer() {
		Reporter.log("Delete Customer", true);
	}
}
