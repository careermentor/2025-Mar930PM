package demoTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScenario6
{

	@Test(groups="May2025Rel")
	public void first_testcase()
	{
		System.out.println("first_testcase");
	}

	@Test
	public void second_testcase()
	{
		System.out.println("second_testcase");
		Assert.assertEquals("Hello", "Hello1");
	}

	@Test
	public void third_testcase()
	{
		System.out.println("third_testcase");
	}

	@Test
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

	@Test
	public void sixth_testcase()
	{
		System.out.println("sixth_testcase");
	}
	
	
}
