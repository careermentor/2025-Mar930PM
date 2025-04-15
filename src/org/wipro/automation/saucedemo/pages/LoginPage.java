package org.wipro.automation.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.wipro.automation.saucedemo.utilitiespkg.ReadPropFilesData;

public class LoginPage 
{

	WebDriver driver;
	
	
	public LoginPage(WebDriver driver) 
	{
		this.driver=driver;
	}

	public void username_textbox(String uname) throws Exception
	{
		
		driver.findElement(By.id(ReadPropFilesData.readElementData("login_username_id"))).sendKeys(uname);
		
	}
	
	public void password_textbox(String uname) throws Exception
	{
		
		driver.findElement(By.name(ReadPropFilesData.readElementData("login_password_name"))).sendKeys(uname);
		
	}
	
	
	public void loginbttn() throws Exception
	{
		
		driver.findElement(By.name(ReadPropFilesData.readElementData("loginbttn_name"))).click();
		
	}
	
}
