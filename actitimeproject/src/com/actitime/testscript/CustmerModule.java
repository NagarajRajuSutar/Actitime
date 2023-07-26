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
public class CustmerModule extends BaseClass {

	@Test
	public void testCreateCustomer() throws InterruptedException, IOException {
		Reporter.log("Exicution started", true);
		
		HomePage h = new HomePage(driver);
		h.setTaskTab();

		FileLib f = new FileLib();
		String customerName = f.getExcelData("CreateCustomer", 1, 3);
		String customerDescription = f.getExcelData("CreateCustomer", 1, 4);

		TaskListPage t = new TaskListPage(driver);
		t.getaddNew().click();
		Thread.sleep(3000); 
		t.getnewCustomer().click();
		Thread.sleep(3000);
		t.getEntercustomerNameTbx().sendKeys(customerName);
		Thread.sleep(3000);
		t.getEntercustomerdescriptionTbx().sendKeys(customerDescription);
		Thread.sleep(3000);
		t.getselectCustomerDropDown().click();
		Thread.sleep(3000);
		t.getbigbangCompany().click();
		Thread.sleep(3000);
		t.getcreateCustomer().click();
		Thread.sleep(3000);
		String actualText = t.getActualText().getText();
		Thread.sleep(3000);
		String ExpectedText =customerName;
		Thread.sleep(3000);
		Assert.assertEquals(actualText, ExpectedText);
		Thread.sleep(3000);

		Reporter.log(" customer is created successfully", true);

	}
}
