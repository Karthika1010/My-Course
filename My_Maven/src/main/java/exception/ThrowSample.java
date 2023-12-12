package exception;

public class ThrowSample {

	public static void sum(int a,int b)
	{
		int s=a+b;
		if (s>60)
		{
			throw new ArithmeticException("sum is greater than 60");
		
		}
		else
		{
			System.out.println("sum is less than 50");
			
		}
	}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
try {
	sum(100,50);
}
catch(ArithmeticException e)
{
	System.out.println(e);
}
	}

}
