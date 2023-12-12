package reversethis;
public class Factorial {
	 int fact=1; 
	 int f;
	 public  int calculate(int num)
	 {
		 int i=1;
	        while(i<=num)
	        {
	            fact=fact*i;
	            i++;
	        }
	        return fact;
	 }
	 public  void display()
	 
	 {
		 f=this.calculate(10);
	        System.out.println("Factorial of the number: "+f);
	 }
	     
public static void main(String []args)
{
Factorial fact=new Factorial();
fact.display();
}
}
	


