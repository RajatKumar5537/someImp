package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNgDemo {
	@Test
	public void testNG() {
		System.out.println("Hi");
		Reporter.log("Bye",true);
		Reporter.log("Hello",false);
		Reporter.log("Welcome",true);
	}
}
