package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CustomerModule12 extends BaseDemoClass {
	@Test
	public void createCustomer() {
		Reporter.log("Create Customer",true);
	}
	@Test
	public void modifyCustomer() {
		Reporter.log("Modify Customer",true);
	}
	@Test
	public void deleteCustomer() {
		Reporter.log("Delete Customer",true);
	}
}
