package org.wipro.automation.saucedemo.datagenerator;

import org.testng.annotations.DataProvider;

public class TestDataGenerator {
	
	@DataProvider(name="setofdata")
	public Object[][] testdata()
	{
		//String data = "standard_user";
		//Object[] data1 = {"standard_user", "secret_sauce"};  //1-d array
		
		Object[][] data = {{"standard_user", "secret_sauce"},{"locked_out_user", "secret_sauce"},{"problem_user", "secret_sauce"}};  //2-d array
		
		return data;
	}
	
	@DataProvider(name="setofdata_product")
	public Object[][] testdata2()
	{
		//String data = "standard_user";
		//Object[] data1 = {"standard_user", "secret_sauce"};  //1-d array
		
		Object[][] data = {{"standard_user", "secret_sauce"},{"locked_out_user", "secret_sauce"},{"problem_user", "secret_sauce"}};  //2-d array
		
		return data;
	}

}
