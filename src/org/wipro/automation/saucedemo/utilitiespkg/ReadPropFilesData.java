package org.wipro.automation.saucedemo.utilitiespkg;


import java.io.FileReader;
import java.util.Properties;

public class ReadPropFilesData 
{

	public static String readconfigData(String key) throws Exception
	{
		FileReader fr = new FileReader("./TestData/config.properties");
		Properties prop = new Properties();
		prop.load(fr);
		return prop.get(key).toString();
	}

	public static String readElementData(String key) throws Exception
	{
		FileReader fr = new FileReader("./TestData/element.properties");
		Properties prop = new Properties();
		prop.load(fr);
		return prop.get(key).toString();
	}

}
