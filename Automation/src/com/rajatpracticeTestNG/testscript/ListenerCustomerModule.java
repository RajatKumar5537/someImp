package com.rajatpracticeTestNG.testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(com.rajatpracticeTestNG.testscript.ListenerImplimentation.class)
public class ListenerCustomerModule {
@Test
	public void createCustomer() {
		Reporter.log("Create Customer",true);
		Assert.fail();
	}
}
