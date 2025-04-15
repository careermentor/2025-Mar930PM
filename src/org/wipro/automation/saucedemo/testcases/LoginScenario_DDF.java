package org.wipro.automation.saucedemo.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.wipro.automation.saucedemo.basepkg.InitiateBrowser;
import org.wipro.automation.saucedemo.datagenerator.TestDataGenerator;
import org.wipro.automation.saucedemo.pages.LoginPage_PF;

public class LoginScenario_DDF extends InitiateBrowser {

	@Test(dataProvider="setofdata", dataProviderClass=TestDataGenerator.class)
	public void tc01_login_valid_credentials(String username, String password) throws Throwable {

		LoginPage_PF login = new LoginPage_PF(driver);

		login.username_textbox(username);
		login.password_textbox(password);

		login.loginbttn();

	}
	
	
	

}
