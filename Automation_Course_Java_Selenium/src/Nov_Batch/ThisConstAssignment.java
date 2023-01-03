package Nov_Batch;

public class ThisConstAssignment {
	
	public ThisConstAssignment() {
		this(23,45,67);
	System.out.println(" Default Constructor");
	}
	
	public ThisConstAssignment(int a) {
		this();
	System.out.println(" One Parameterized Constructor");
	}
	
	public ThisConstAssignment(int a, int b) {
		this(32);
	System.out.println(" Two Parameterized Constructor");
	}
	
	public ThisConstAssignment(int a, int b, int c) {
			System.out.println(" Three Parameterized Constructor");
	}
	
	public ThisConstAssignment(int a, int b, int c, int d) {
		
		this(23,45);
	System.out.println(" Four Parameterized Constructor");
	}
	
	public static void main (String[] args)
	{
		ThisConstAssignment obj = new ThisConstAssignment(23,34,45,56);
	}
}
