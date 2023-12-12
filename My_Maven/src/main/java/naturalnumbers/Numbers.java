package naturalnumbers;
import java.util.Scanner;
public class Numbers {

	int i=1;
	public void details()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=sc.nextInt();
		System.out.println("Numbers are : ");

		while(i<=n)
		{
			System.out.println(i);
			i++;
		}
	}
	public static void main(String args[])
	{
	Numbers num=new Numbers();
	num.details();
	}
	}
