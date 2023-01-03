package Nov_Batch;

public class Airthmetic
{
	public int sum(int a, int b) 
	{
	   int c;
	   c = a+b;
	   System.out.println("sum result is" + c);
	   return c;
	}
	
	public int sub (int a1, int b1)
	{
		int d = a1 - b1;
		System.out.println("Subtract reulst is " + d);
		return d;
	}
	public int mul (int a2, int b2)
	{
		int d = a2 * b2;
		System.out.println("Multiplication reulst is " + d);
		return d;
	}
	public int div (int a3, int b3)
	{
		int d = a3 / b3;
		System.out.println("Division reulst is " + d);
		return d;
	}
	
	public static void main (String[] args)
	{
		Airthmetic maths = new Airthmetic();
		int sumresult = maths.sum(10, 2);
		int subresult = maths.sub(12, 2);
		int divresult = maths.div(12, 2);
		int mulresult = maths.mul(12, 2);
		
	}
}
