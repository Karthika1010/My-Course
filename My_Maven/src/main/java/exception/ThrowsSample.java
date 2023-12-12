package exception;
import java.io.IOException;
public class ThrowsSample {  
		public static  void method()throws IOException
		{  
		    throw new IOException("device error"); 
		  }  
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub

		try {
			method();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		System.out.println("normal flow ");
	}

}
