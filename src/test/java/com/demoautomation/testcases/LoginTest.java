package com.demoautomation.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.demoautomation.factory.DataProviderFactory;
import com.demoautomation.pages.BaseClass;
import com.demoautomation.pages.LoginPage;
import com.demoautomation.pages.LogoutPage;

public class LoginTest extends BaseClass
{
	LoginPage login;
	LogoutPage logOut;
	
	@Test(priority=1)
	public void loginWithAdmin() 
	{
		logger=report.createTest("LoginTest", "Login to CRM with valid credential");
		login=PageFactory.initElements(driver, LoginPage.class);
		login.loginToApplication(DataProviderFactory.getExcel().getCellData("Login", 0, 0),DataProviderFactory.getExcel().getCellData("Login", 0, 1));
	}
	
	@Test(priority=2,dependsOnMethods="loginWithAdmin")
	public void logout() 
	{
		logger=report.createTest("Logout Test", "Logout from current session");
		logOut=PageFactory.initElements(driver, LogoutPage.class);
		logOut.logOutFromApplication();
	}

}
