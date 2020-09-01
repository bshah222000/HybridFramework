package com.demoautomation.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.demoautomation.factory.DataProviderFactory;
import com.demoautomation.pages.BaseClass;
import com.demoautomation.pages.LoginPage;
import com.demoautomation.pages.UserManagement;

public class CreateUser extends BaseClass{

	LoginPage login;
	UserManagement user;
	
	@Test
	public void createUser()
	{
		logger=report.createTest("CreateUser", "This test will create new user");
		login=PageFactory.initElements(driver, LoginPage.class);
		user=PageFactory.initElements(driver, UserManagement.class);
		login.loginToApplication(DataProviderFactory.getExcel().getCellData("Login", 0, 0),DataProviderFactory.getExcel().getCellData("Login", 0, 1));
		user.createUser();
	}
	
	
}
