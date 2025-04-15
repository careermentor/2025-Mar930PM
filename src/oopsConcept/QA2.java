package oopsConcept;

public class QA2 extends QA1
{

	int x = 100;  //global variable
	
	public void printValX()
	{
		final int x = 200;  //local variable
		//x=300;
		
		System.out.println(x);  //
		
		System.out.println(this.x);
		System.out.println(super.x);
		
		
		super.sum(20,30);
		
	}
	
	

	/*
	public void sum(int a, int b)
	{
		int c = a*a+b*b;
		System.out.println("sum of 2 numbers: " + c);
		
	}

	*/
	
	public void subs(int a, int b)
	{
		
		int c = a-b;
		System.out.println("substraction between 2 numbers: " + c);
		
	}
	
	
	public static void main(String[] args)
	{
	
		QA2 q2 = new QA2();
	
		q2.printValX();
		
		q2.sum(20, 30);
		
	
		
	}
	
	public static void main(int a)
	{
	
		QA2 q2 = new QA2();
		
		//q2.sum(20, 30);
		//q2.qa1im();
		
		q2.printValX();
		
	}



	
	public void qa1im() {
		System.out.println("this is QA1I method");
		
	}
	
}
