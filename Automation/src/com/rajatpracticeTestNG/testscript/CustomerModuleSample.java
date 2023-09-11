package com.rajatpracticeTestNG.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CustomerModuleSample {

	@Test(priority = 3, invocationCount = 3)
	public void createCustomer() {
		Reporter.log("Create Customer",true);
	}
	@Test (priority = 2, dependsOnMethods = "createCustomer")
	public void modifyCustomer () {
		Reporter.log("Modify Customer",true);
	}
	@Test (priority = 1, dependsOnMethods = {"createCustomer","modifyCustomer"})
	public void deleteCustomer() {
		Reporter.log("Delete Customer",true);
	}
}
