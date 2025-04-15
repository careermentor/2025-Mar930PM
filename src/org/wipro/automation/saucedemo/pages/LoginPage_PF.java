package org.wipro.automation.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.wipro.automation.saucedemo.utilitiespkg.ReadPropFilesData;

public class LoginPage_PF 
{

	WebDriver driver;
	
	
	public LoginPage_PF(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(id="user-name")
	WebElement  username_textbox;
	
	@FindBy(name="password")
	WebElement  password_textbox;
	
	@FindBy(name="login-button")
	WebElement  loginbttn;
	
	
	public void username_textbox(String uname) throws Exception
	{
		
		username_textbox.sendKeys(uname);
		
	}
	
	public void password_textbox(String uname) throws Exception
	{
		
		password_textbox.sendKeys(uname);
		
	}
	
	
	public void loginbttn() throws Exception
	{
		
		loginbttn.click();
		
	}
	
}
