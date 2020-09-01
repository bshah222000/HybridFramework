package com.demoautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.demoautomation.factory.DataProviderFactory;
import com.demoautomation.utility.Helper;

public class UserManagement {

	WebDriver driver;

	public UserManagement(WebDriver driver) {
		this.driver = driver;
	}

	By adminTab = By.xpath("//b[text()='Admin']");

	By addButton = By.id("btnAdd");

	By empName = By.xpath("//input[contains(@id,'mpName')]");
	
	By userName=By.xpath("//input[contains(@id,'userName')]");
	
	By pass=By.xpath("//input[contains(@id,'password')]");
	
	By confirmPass=By.xpath("//input[contains(@id,'confirmPassword')]");
	
	By saveButton=By.xpath("//input[contains(@id,'Save')]");

	public void createUser() 
	{
		Helper.waitForWebElementAndClick(driver, adminTab, "Click on Admin tab");
		Helper.waitForWebElementAndClick(driver, addButton, "Click on add button");
		Helper.waitForWebElementAndType(driver, empName, "John Smith", "Enter emp Name");
		Helper.waitForWebElementAndType(driver, userName,DataProviderFactory.getExcel().getCellData("NewUser", 0, 0), "Enter emp Name");
		Helper.waitForWebElementAndType(driver, pass,DataProviderFactory.getExcel().getCellData("NewUser", 0, 1), "Enter password");
		Helper.waitForWebElementAndType(driver, confirmPass,DataProviderFactory.getExcel().getCellData("NewUser", 0, 2), "Enter emp Name");
	}
}
