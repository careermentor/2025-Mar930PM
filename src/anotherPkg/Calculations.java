package anotherPkg;

import testPackage.FirstClass;

public class Calculations 
{
	public Calculations()
	{
		int a = 40;
		int b = 50;
		int c = a+b;
		System.out.println("This is sum of 2 numbers: " + c);
		
	}


	public Calculations(int a, int b)  //method with input/with arguments/with parameter
	{
		int c = a+b;
		System.out.println("addition of 2 numbers: " + c);
		
	}
	
	public int sum()  //without input //without argument //without parameter
	{
		int a = 20;
		int b = 30;
		int c = a+b;
		System.out.println("This is sum of 2 numbers: " + c);
		return a;
		
	}
	
	public int add(int a, int b)  //method with input/with arguments/with parameter
	{
		int c = a+b;
		System.out.println("addition of 2 numbers: " + c);
		return c;
	}
	
	public static void main(String[] args)
	{

		Calculations cal = new Calculations(50, 60);
		
		Calculations cal1 = new Calculations();
		
		cal.sum();
		cal1.sum();
		
		//int y = cal.sum();
		//System.out.println(y);
		//int x = cal.add(30, 40);
		//cal.add(x, y);
		
		//cal.sum();
		
		FirstClass fc = new FirstClass();
		fc.printvalues();
		
	}
	
	
}
