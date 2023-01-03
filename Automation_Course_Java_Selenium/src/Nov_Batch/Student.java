package Nov_Batch;

public class Student 
{  // {   } indicate boundary ( body ) of the class
  
	int a; // A is a variable which can store integer values.
	
	public void method()  // This indicates method
	{
		System.out.println("Welocome to Automation");
		
	}
	
	public static void main (String [] args) // Calling up of main method
	{
		Student subodh = new Student ();
		subodh.method();
		subodh.a= 2;
		System.out.println(subodh.a);
		subodh.a=455;
		System.out.println(subodh.a);
		
	}
	
}
