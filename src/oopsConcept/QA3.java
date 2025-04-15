package oopsConcept;

public class QA3 extends QA1
{

	
	public void multiplcation(int a, int b)
	{
		
		int c = a*b;
		System.out.println("multiplcation of 2 numbers: " + c);
		
	}
	
	
	public static void main(String[] args)
	{
	
		QA3 q3 = new QA3();
		q3.multiplcation(20, 30);
		//q3.subs(20, 30);
		q3.sum(20, 30);
		
	}
	
	
}
