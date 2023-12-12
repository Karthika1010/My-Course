package inheritancejava;
import java.util.Scanner;

public class Employee {
double basicpay;
double deduction;
double bonus;
	
	public void details()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter basicpay is:");
		basicpay=sc.nextDouble();
		System.out.println("enter deduction is:");
		deduction=sc.nextDouble();
		System.out.println("enter bonus is:");
		bonus=sc.nextDouble();

		}

}
