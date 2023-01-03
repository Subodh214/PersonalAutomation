package Nov_Batch;
// (((((10+2)+2)-2)*2)/2)
public class AirthemeticAssignment1
{

	public int sum1(int a1, int a2)
	{
		int a3 = a1 + a2;
		System.out.println("Sum result is " + a3);
		return a3;
	}

	public int sub(int b1, int b2)
	{
		int b3 = b1 - b2;
		System.out.println("Subtract result is " + b3);
		return b3;
	}
	public int mul(int c1, int c2)
	{
		int c3 = c1*c2;
		System.out.println("Multiplication result is " + c3);
		return c3;
	}
	public int div(int d1, int d2)
	{
		int d3 = d1 / d2;
		System.out.println("Division result is " + d3);
		return d3;
	}
	
	public static void main (String[] args)
	{
		AirthemeticAssignment1 obj =  new AirthemeticAssignment1();
		int sumresult = obj.sum1(10, 2);
		int sum1result = obj.sum1(sumresult, 2);
		int subresult = obj.sub(sum1result, 2);
		int mulresult = obj.mul(2, subresult);
		int finalresult = obj.div(mulresult,2);
		System.out.println(" The Final result is " + finalresult);
		
	
	}
}
