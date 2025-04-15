package org.wipro.automation.saucedemo.basepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.wipro.automation.saucedemo.utilitiespkg.ReadPropFilesData;

public class InitiateBrowser {

	public WebDriver driver;

	@BeforeMethod
	public void launchBrowser() throws Exception {

		if (ReadPropFilesData.readconfigData("BrowserName").equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}

		else if (ReadPropFilesData.readconfigData("BrowserName").equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}

		else if (ReadPropFilesData.readconfigData("BrowserName").equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
		}

		else {
			driver = new ChromeDriver();
		}

		driver.get(ReadPropFilesData.readconfigData("ApplicationURL"));
	}

	@AfterTest
	public void quitBrowser() {
		//driver.quit();
	}
}
