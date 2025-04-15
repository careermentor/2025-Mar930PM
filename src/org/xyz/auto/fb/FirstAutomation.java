package org.xyz.auto.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstAutomation
{
	WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser()
	{
		driver= new ChromeDriver();  //chrome broswer
		driver.get("https://www.facebook.com/");
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		//driver.close();
	}

	@Test
	public void loginpage()
	{
		WebElement username_textbox = driver.findElement(By.id("email"));
		username_textbox.sendKeys("user1@gmail.com");
		
		username_textbox.clear();
		
		username_textbox.sendKeys("user2@gmail.com");
		
		
		driver.findElement(By.name("pass")).sendKeys("pass1234");
		driver.findElement(By.cssSelector("[type='submit']")).click();
		
	}
	
	@Test(enabled=false)
	public void signupPage()
	{
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.name("firstname")).sendKeys("JOhn");
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		driver.findElement(By.name("websubmit")).click();
		
	}
	
}
