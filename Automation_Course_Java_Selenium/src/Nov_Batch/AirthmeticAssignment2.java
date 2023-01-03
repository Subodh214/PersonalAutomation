package Nov_Batch;

public class AirthmeticAssignment2 {

	// (((((10*2)-2)+2)-2)/2)
	public int mul (int a2, int b2)
	{
		int c2 = a2 * b2;
		System.out.println("mul result is " + c2);
		return c2;
	}
	public int sub (int a1, int b1)
	{
		int c1 = a1 - b1;
		System.out.println("Sub result is " + c1);
		return c1;
	}
	public int sum (int a, int b)
	{
		int c = a + b;
		System.out.println("Sum result is " + c);
		return c;
	}
	
	public int div (int a3, int b3)
	{
		int c3 = a3 / b3;
		System.out.println("Div result is " + c3);
		return c3;
	}
	
	public static void main (String [] args)
	{
		AirthmeticAssignment2 obj = new AirthmeticAssignment2();
		int mulresult = obj.mul(10, 2);
		int subresult = obj.sub(mulresult, 2);
		int sumresult = obj.sum(2, subresult);
		int sub1result = obj.sub(sumresult, 2);
		int finalresult = obj.div(sub1result, 2);
		System.out.println("Final result  is " + finalresult);
	}
	
}
