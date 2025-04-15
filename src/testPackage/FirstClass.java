package testPackage;

 public class FirstClass 
{
	int a = 20;  //global variable
	
	
	float b= 10.5f;
	char x = 'A';
	String c = "Java";
	boolean d = true;
	
	String name = "Santosh";
	
	 public void printvalues()
	{
		//final int a=10;  //local variable
		int a=30;
		
		
		System.out.println(this.a);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
		System.out.println(c);
		System.out.println(d);
		
	}
	
	
	 void valA()
	{
		System.out.println(a);
	}
	
	public static void main(String[] args) 
	{
	
		FirstClass abc = new FirstClass();  //object of the class
		
		abc.printvalues();
		
		System.out.println(abc.name);
		
		//Calculations cal = new Calculations();
		//cal.sum();
		
		abc.valA();
		
	}
	

}
