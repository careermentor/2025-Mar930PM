package oopsConcept;

public class CallDemoInterface// implements DemoInterface
{


	public void meth1()
	{
	
		System.out.println("this is interface M1");
	}

	
	public void meth2()
	{
		System.out.println("this is interface M2");
		
	}

	public static void main(String[] args) 
	{
	
		CallDemoInterface abc = new CallDemoInterface();
		abc.meth1();
		abc.meth2();
		
		QA1.sum(20,30);
		
	}
	
}
