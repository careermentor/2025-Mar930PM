package org.xyz.auto.fb;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HandleKey_Mouse_Alerts_Window_Frames
{
	WebDriver driver;
	

	
	@Test
	public void tc01_handleFrames() throws Exception
	{
		driver= new ChromeDriver();  //chrome broswer
		driver.get("https://demoqa.com/frames");
		
		System.out.println( driver.findElement(By.xpath("//h1[text()='Frames']")).getText()      );
		
		CaptureScreenshot.itresult(driver,"tc01_handleFrames_1");
		
		driver.switchTo().frame("frame1");
		
		System.out.println( driver.findElement(By.xpath("//h1[text()='This is a sample page']")).getText()      );
		
		CaptureScreenshot.itresult(driver,"tc01_handleFrames_2");
	
	}
		
	@Test(enabled=true)
	public void tc02_handleAlerts() throws Exception
	{
		driver= new ChromeDriver();  //chrome broswer
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.className("signin-btn")).click();
		
		Thread.sleep(5000);
		
		driver.switchTo().alert().accept();
		
		CaptureScreenshot.itresult(driver,"tc02_handleAlerts");
	
	}
	
		
	@Test(enabled=false)
	public void handlemouse() throws Exception
	{
		driver= new ChromeDriver();  //chrome broswer
		driver.get("https://www.thetestingworld.com/");
		
		Actions act = new Actions(driver);
		
		act.moveToElement(driver.findElement(By.xpath("//span[text()='ABOUT US']"))).perform();
		
		//act.click(driver.findElement(By.xpath("//span[text()='Mission & Vision']"))).perform();
		
		//act.doubleClick(driver.findElement(By.xpath("//span[text()='Mission & Vision']"))).perform();
		
		//act.contextClick(driver.findElement(By.xpath("//span[text()='Mission & Vision']"))).perform();
		
		act.keyDown(Keys.CONTROL).click(driver.findElement(By.xpath("//span[text()='Mission & Vision']"))).keyUp(Keys.CONTROL).perform();
		
		Set<String> winsid = driver.getWindowHandles();
		
		System.out.println(winsid);
		
		Iterator<String> itr = winsid.iterator();
		
		
		String win1 = itr.next();
		String win2 = itr.next();
		
	
		driver.switchTo().window(win2);
		//driver.switchTo().window(win1);
		
	}
	
	
	@Test(enabled=false)
	public void handlekeyboard() throws Exception
	{
		driver= new ChromeDriver();  //chrome broswer
		driver.get("https://www.facebook.com/");
		
		Actions act = new Actions(driver);
		
		act.sendKeys(Keys.PAGE_DOWN).perform();
		
	//	act.sendKeys("user1").perform();
		
		//Thread.sleep(5000);
		
		//act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();
		
		//act.sendKeys(Keys.TAB).perform();
		//act.sendKeys("pass1234").perform();
		
		//act.sendKeys(Keys.ENTER).perform();
		
		
	}
	
	
}
