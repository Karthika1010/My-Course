package recurringdeposit;
import java.util.Scanner;
public class Hdfc implements Rbi {
	public void recurringdeposit() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount");
		double amount = sc.nextDouble();
		System.out.println("Enterthe  tenure");
		int year  = sc.nextInt();
		double totalamount = (amount*12)*year;
		System.out.println("Total amount received  is:" +totalamount);
		System.out.println(" interest rate is :"+INTEREST_RATE);
		sc.close();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hdfc hd = new Hdfc();
		hd.recurringdeposit();
	}

}
