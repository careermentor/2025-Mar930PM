package org.wipro.automation.saucedemo.testcases;

import org.testng.annotations.Test;
import org.wipro.automation.saucedemo.basepkg.InitiateBrowser;
import org.wipro.automation.saucedemo.pages.LoginPage_PF;
import org.wipro.automation.saucedemo.utilitiespkg.ReadPropFilesData;

public class LoginScenario extends InitiateBrowser
{

	@Test
	
	
	
	public void tc01_login_valid_credentials() throws Throwable
	{
	
		LoginPage_PF login = new LoginPage_PF(driver);
		
		//because "this.driver" is null
		
		//login.username_textbox("standard_user");
		//login.password_textbox("secret_sauce");
		
		login.username_textbox(ReadPropFilesData.readconfigData("username"));
		login.password_textbox(ReadPropFilesData.readconfigData("password"));
	
		
		login.loginbttn();
		
	}
	
}
