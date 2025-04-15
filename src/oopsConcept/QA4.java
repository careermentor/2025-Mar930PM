package oopsConcept;

public class QA4 extends QA2 implements QA3I
{

	
	public void division(int a, int b)
	{
		
		int c = a/b;
		System.out.println("division between 2 numbers: " + c);
		
	}
	
	
	public static void main(String[] args)
	{
	
		QA4 q4 = new QA4();
		q4.division(40, 20);
		q4.subs(20, 30);
		q4.sum(20, 30);
		
		//q3.multiplcation(20, 30);
		
		q4.qa3im();
		
		
		
	}



	public void qa3im() {
	System.out.println("this is QA3I method");
		
	}
	
	
}
