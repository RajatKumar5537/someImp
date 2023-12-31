package com.actitimeProject.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitimeProject.generic.BaseClass;
import com.actitimeProject.pom.HomePage;
import com.actitimeProject.pom.TaskListPage;

import Selenium.FileLib;

public class CustomerModule extends BaseClass{
	@Test
	public void testCreateCustomer() throws InterruptedException, EncryptedDocumentException, IOException{
	Reporter.log("Create Customer",true);
	FileLib f=new FileLib();
	String customerName = f.getExcelData("CreateCustomer",1,3);
	String customerDesc = f.getExcelData("CreateCustomer",1,4);
	HomePage h=new HomePage(d);
	h.setTaskTab();
	TaskListPage t=new TaskListPage(d);
	t.getAddNewBtn().click();
	t.getNewCustomerOption().click();
	t.getCustomerNameTbx().sendKeys(customerName);
	t.getCustomerDescriptionTbx().sendKeys(customerDesc);
	t.getSelectCustomerDropDown().click();
	t.getBigBangCompany().click();
	t.getCreateCustomerBtn().click();
	Thread.sleep(5000);
	String actualText = t.getActualCustomerCreated().getText();
	Assert.assertEquals(actualText, customerName);
}
}