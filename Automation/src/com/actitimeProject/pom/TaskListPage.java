package com.actitimeProject.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNewBtn;

	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newCustomerOption;

	@FindBy(xpath="//input[@placeholder='Enter Customer Name' and @class]")
	private WebElement customerNameTbx;

	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement customerDescriptionTbx;

	@FindBy(xpath="//div[text()='- Select Customer -' and @class='emptySelection']")
	private WebElement selectCustomerDropDown;

	@FindBy(xpath="//div[text()='Big Bang Company'  and @class='itemRow cpItemRow ']")
	private WebElement bigBangCompany;

	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createCustomerBtn;

	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[1]")
	private WebElement actualCustomerCreated;

	public TaskListPage(WebDriver d) {
		PageFactory.initElements(d, this);
	}

	public WebElement getAddNewBtn() {
		return addNewBtn;
	}

	public WebElement getNewCustomerOption() {
		return newCustomerOption;
	}

	public WebElement getCustomerNameTbx() {
		return customerNameTbx;
	}

	public WebElement getCustomerDescriptionTbx() {
		return customerDescriptionTbx;
	}

	public WebElement getSelectCustomerDropDown() {
		return selectCustomerDropDown;
	}

	public WebElement getBigBangCompany() {
		return bigBangCompany;
	}

	public WebElement getCreateCustomerBtn() {
		return createCustomerBtn;
	}

	public WebElement getActualCustomerCreated() {
		return actualCustomerCreated;
	}

}
