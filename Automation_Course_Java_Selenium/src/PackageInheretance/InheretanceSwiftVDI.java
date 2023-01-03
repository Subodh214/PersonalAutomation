package PackageInheretance;

public class InheretanceSwiftVDI extends InheretanceSwift

{
	public void m3() 
	{
		System.out.println("I am child class");
	}
	
	public static void main(String[] args)
	{
		InheretanceSwiftVDI s=new InheretanceSwiftVDI();
		s.m1();
		s.m2();
		s.m3();
		s.price=100;
		System.out.println("Price is " + s.price);
	}
}
