package org.xyz.auto.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FetchData
{
	WebDriver driver;
	
	@Test
	public void testcaseautomation() throws Exception
	{
		driver= new ChromeDriver();  //chrome broswer
		
		//Step1
		String expURL = "https://www.facebook.com";
		
		driver.get(expURL);
		
		
		String actURL = driver.getCurrentUrl();
		System.out.println(actURL);
		
		//Assert.assertEquals(actURL, expURL);  //hard assertion - compare (if fails, it stop)
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actURL, expURL);  //soft assertion  - compare  //fail
		
		//Step2
		String expTitle = "Facebook – log in or sign up";
		
		String actTitle  =driver.getTitle();
		System.out.println(actTitle);
		
		sa.assertEquals(actTitle, expTitle);
		
		//Step3
		
		String exp_username = "Email address or phone number";
		
		String act_username = driver.findElement(By.id("email")).getDomAttribute("placeholder");
		System.out.println(act_username);
		
		sa.assertEquals(act_username, exp_username);  //fail
		
		boolean act_rb = driver.findElement(By.cssSelector("[data-cy='oneWayTrip']")).isSelected();
		
		boolean act_signup= driver.findElement(By.cssSelector("[type='submit']")).isEnabled();
		
		Assert.assertEquals(act_rb, true);
		
		//Step4
		
		String exp_loginbttn = "Log in";
		
		String act_loginbttn = driver.findElement(By.name("login")).getText();
		System.out.println(act_loginbttn);
		
		sa.assertEquals(act_loginbttn, exp_loginbttn);  ///pass
		
		
		sa.assertEquals(driver.findElement(By.name("login")).getText(), "Log in");
		
		Point login_loc = driver.findElement(By.name("login")).getLocation();
		System.out.println(login_loc);
		
		sa.assertAll();
		
		//System.out.println(driver.getPageSource());

	}
	
	@Test
	public void meth2()
	{
		System.out.println("this is method2");
	}
	
}
