package Nov_Batch;

public class Assignment1 
	{   // indicates boundary of class
	
	int rollNo; // defining a variable
	int age; 
 
	public void display1() // indicate method 1
	{
		System.out.println("Wellcome all of you");
	}
	
	public void display2()
	{
		System.out.println("Automation is easy");
	}
	
	public static void main (String [] args)
	{
		Assignment1 student = new Assignment1();
		student.rollNo = 10;
		student.age = 25;
		System.out.println("Student roll number is " + student.rollNo + " and age is " + student.age);
		student.display1();
		student.display2(); 
	
		
	}
}
