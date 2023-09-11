package com.rajatpracticeTestNG.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ProjectModule extends BaseClassa {
	@Test
	public void CreateProject() {
		Reporter.log("Create Project",true);
	}
	@Test
	public void modifyProject() {
		Reporter.log("MOdify Project",true);
	}
	@Test
	public void deleteProject() {
		Reporter.log("Delete Project",true);
	}
}
