package org.xyz.auto.fb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class BrowserControl
{
	WebDriver driver;
	
	@Test
	public void differentActions() throws Exception
	{
		driver= new ChromeDriver();  //chrome broswer
		
		driver.manage().window().maximize();
		
		driver.get("https://www.thetestingworld.com/testings/");
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.name("fld_username")).sendKeys("wessite");
		
		driver.findElement(By.id("datepicker")).sendKeys("07/04/2008");
		driver.findElement(By.xpath("//a[text()='4']")).click();
		
		
		//driver.findElement(By.cssSelector("[value='home']")).click();
		
		//Select gen = new Select(driver.findElement(By.name("sex")));
		
		//gen.selectByIndex(1);  //Male
		//gen.selectByValue("2"); //Female
		
		//gen.selectByVisibleText("Male");
		
		//gen.selectByContainsVisibleText("Mal");
		
		//gen.deselectAll();
		
		//gen.selectByVisibleText("Male");
		
		Select con = new Select(driver.findElement(By.name("country")));
		con.selectByVisibleText("United States");
		
		Select st = new Select(driver.findElement(By.name("state")));
		//Thread.sleep(5000);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("stateId")), "Hawaii"));
		
		st.selectByVisibleText("Florida");
		
		
		
	//	driver.findElement(By.name("terms")).click();
		
		//driver.findElement(By.className("displayPopup")).click();
		
		//Thread.sleep(5000);
		
		//driver.findElement(By.className("close")).click();
	
	}
	
	
	@Test(enabled=false)
	public void launchBrowser() throws Exception
	{
		driver= new ChromeDriver();  //chrome broswer
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		Thread.sleep(5000);
		
		driver.navigate().to("https://www.facebook.com/");
		
		Thread.sleep(5000);
		
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		
	
		driver.close();  //will close only one window at a time
		
		driver.quit();
	}
	
	
	
}
