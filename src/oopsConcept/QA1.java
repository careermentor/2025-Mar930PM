package oopsConcept;

public class QA1
{
	
	static int x = 500;
	

	/*
	public QA1()
	{
		System.out.println("This is constructor");
	}
	
	
	public QA1(int a, int b)
	{
		System.out.println("This is constructor");
		
		int c = a+b;
		System.out.println("sum of 2 numbers: " + c);
	}
	*/
	
	
	public static void sum(int a, int b)
	{
		int c = a+b;
		System.out.println("sum of 2 numbers: " + c);
		
	}

	public void sum(int a, float b)
	{
		float c = a+b;
		System.out.println("sum of 2 numbers: " + c);
		
	}
	
	public void sum(int a, int b, int c)
	{
		int d = a+b+c;
		System.out.println("sum of 3 numbers: " + d);
		
	}
	
	public static void main(String[] args)
	{
	
		sum(20,30);
		
		System.out.println(x);
		
	}
	
	public static void main(int a)
	{
	
		QA2 q2 = new QA2();
		
		//q2.sum(20, 30);
	}
	
}
