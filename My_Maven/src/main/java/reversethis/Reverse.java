package reversethis;
public class Reverse {
	int num,remainder;
	int rev=0;
	Reverse(int num)
	{
		this.num=num;
	
	while(num != 0)   
		{
	 this.remainder = num % 10;  
	this.rev = rev * 10 + remainder;  
		num = num/10;  
}
	}
	Reverse()
	{
		this(12345);
		System.out.println("The reverse of the given number is: " + rev); 
	}
	
	public static void main(String args[])
	{
	Reverse r=new Reverse();
	}
	}