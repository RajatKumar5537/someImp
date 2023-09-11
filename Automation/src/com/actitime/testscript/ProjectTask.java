package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ProjectTask extends BaseDemoClass{
	@Test
	public void createTask() {
		Reporter.log("Create Task",true);
	}
	@Test
	public void modifyTask() {
		Reporter.log("Modify Task",true);
	}
	@Test
	public void deleteTask() {
		Reporter.log("Delete Task",true);
	}
}
