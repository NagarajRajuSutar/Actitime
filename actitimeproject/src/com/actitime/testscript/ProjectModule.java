package com.actitime.testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;

@Listeners(com.actitime.generic.LstenerImplementation.class)
public class ProjectModule extends BaseClass {

	@Test
	public void testCreatProject() throws IOException, InterruptedException {
		Reporter.log("Exicution started", true);
		HomePage h = new HomePage(driver);
		h.setTaskTab();
		
		FileLib f = new FileLib();
		String projectName = f.getExcelData("CreatProject", 1, 3);
		String projectDescription = f.getExcelData("CreatProject", 1, 4);
		
		TaskListPage t = new TaskListPage(driver);
		t.getaddNew().click();
		Thread.sleep(3000); 
		t.getnewProject().click();
		Thread.sleep(3000);
		t.getprojectName().sendKeys(projectName);
		Thread.sleep(3000);
		t.getselectCustomerDropdown01().click();
		Thread.sleep(3000);
		t.getourCompany().click();
		Thread.sleep(3000);
		t.getprojectDescription().sendKeys(projectDescription);
		Thread.sleep(3000);
		t.getcreatProjectBtn().click();
		Thread.sleep(3000);
		String actualText = t.getactutalTitle().getText();
		Thread.sleep(3000);
		String ExpectedText =projectName;
		Thread.sleep(3000);
		Assert.assertEquals(actualText, ExpectedText);
		Thread.sleep(3000);
		Reporter.log(" project is created successfully", true);
	}
}
