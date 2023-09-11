package com.rajat.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CustomerModule {

	@Test(priority=1, invocationCount=3)
	public void CreateCustomer() {
		Reporter.log("Create Customer",true);
	}
	
	@Test(priority=2, dependsOnMethods = "CreateCustomer")
	public void modifyCustomer() {
		Reporter.log("MOdify Customer",true);
	}
	
	@Test(priority=3, dependsOnMethods = {"CreateCustomer","modifyCustomer"} )
	public void deleteCustomer() {
		Reporter.log("Delete Customer",true);
	}
}
