package demoTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScenario
{

	@Test
	public void first_testcase()
	{
		System.out.println("first_testcase");
		
		
		Assert.assertEquals("Hello", "Hello1");
		Assert.assertEquals("Hello", "Hello world","This is failed");
		
	}

	@Test(groups="Smoke")
	public void second_testcase()
	{
		System.out.println("second_testcase");
	}

	@Test
	public void third_testcase()
	{
		System.out.println("third_testcase");
	}

	@Test(groups="Sanity")
	public void forth_testcase()
	{
		System.out.println("forth_testcase");
		Assert.assertEquals("Hello", "Hello1");
	}

	@Test
	public void fifth_testcase()
	{
		System.out.println("fifth_testcase");
	}

	@Test(groups={"Sanity","Regression"})
	public void sixth_testcase()
	{
		System.out.println("sixth_testcase");
	}
	
	
}
