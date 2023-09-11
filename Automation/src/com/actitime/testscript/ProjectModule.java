package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ProjectModule extends BaseDemoClass{
	@Test
	public void createProject() {
		Reporter.log("Create Project",true);
	}
	@Test
	public void modifyProject() {
		Reporter.log("Modify Project",true);
	}
	@Test
	public void deleteProject() {
		Reporter.log("Delete Project",true);
	}
}
