package exception;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{  
		      int a[]=new int[10];
		      a[15]=5;
		      int num=25/0;  
		   }
		catch(ArithmeticException e)
		{
			System.out.println("Exception is divisible by zero");
			}  
		/*catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(" Index is out of bounds");
		}*/
		catch(Exception e)
		{
		System.out.println("Parent exception");
			
		}
		finally
		{
			System.out.println("finally block is  executed");  
		}
		     
		   System.out.println("hi");  
		  }  
		

	}


