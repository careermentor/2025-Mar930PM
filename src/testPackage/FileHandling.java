package testPackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

public class FileHandling 
{
	
	public static void readprop() throws Exception
	{
		FileReader fr = new FileReader("./TestData/abc.properties");
		
		Properties prop = new Properties();
		
		prop.load(fr);
		
		System.out.println(prop.get("lang"));
		System.out.println(prop.get("automation"));
	}
	
	

	public static void readdata() throws Exception  
	{
		
		
		//File f = new File("C:\\TestData\\data.txt");  //file connection
		
	//	FileReader fr = new FileReader(f);
		
		
		//FileReader fr = new FileReader("C:\\TestData\\data.txt");
		
		FileReader fr = new FileReader("./TestData/data.txt");
		
		
		int r = fr.read();  //84
		
		
		while(r!=-1)   //84!=-1, 104!=-1, -1!=-1
		{
			System.out.print((char) r);
			r = fr.read();
		}
		
		/*
		System.out.print((char) r);
		
		r = fr.read();
		System.out.print((char) r);
		
		r = fr.read();
		System.out.print((char) r);
		
		r = fr.read();
		System.out.print((char) r);
		
		r = fr.read();
		System.out.print((char) r);
		
		r = fr.read();
		System.out.print((char) r);
		
		r = fr.read();
		System.out.print((char) r);
		
		r = fr.read();
		System.out.print((char) r);
		
		r = fr.read();
		System.out.print((char) r);
		*/
		
	}
	
	
	public static void main(String[] args) throws Exception
	{
	
		readprop();
	
	}
	
}
