package Nov_Batch;
// Three parameterized constructor
// Default constructor
// One parameterized constructor
// Two parameterized constructor
// Four parameterized constructor
public class ConstrucAssigment {

	public ConstrucAssigment() {
		// TODO Auto-generated constructor stub
		System.out.println(" Default Constructor");
	}
	
	public ConstrucAssigment(int a) {
		// TODO Auto-generated constructor stub
		System.out.println(" One Parameterized Constructor");
	}
	public ConstrucAssigment(int a, int b) {
		// TODO Auto-generated constructor stub
		System.out.println(" Two Parameterized Constructor");
	}
	public ConstrucAssigment(int a, int b, int c) {
		// TODO Auto-generated constructor stub
		System.out.println(" Three Parameterized Constructor");
	}
	public ConstrucAssigment(int a, int b, int c, int d) {
		// TODO Auto-generated constructor stub
		System.out.println(" Four Parameterized Constructor");
	}
	
	public static void main (String[] args) {
		ConstrucAssigment obj = new ConstrucAssigment(34);
		ConstrucAssigment obj1 = new ConstrucAssigment(23,34);
		ConstrucAssigment obj2 = new ConstrucAssigment(12,23,34);
		ConstrucAssigment obj3 = new ConstrucAssigment(21,32,43,54);
	}
	
}
