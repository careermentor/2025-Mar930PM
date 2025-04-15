package oopsConcept;

public class CallDemoAbsClass extends DemoAbsClass
{

	
	public void password()
	{
	
		System.out.println("this is my password: pass1234");
		
	}

	
	public static void main(String[] args) 
	{
	
		CallDemoAbsClass abc = new CallDemoAbsClass();
		abc.username();
		abc.password();
		
	}
	
}
