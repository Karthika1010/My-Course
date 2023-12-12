package polymorphismassignment;
import java.util.Scanner;
public class Offseason  {

	double discount;
	double costprice;
	double PaidAmount;
	public void discount()
{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the cost price for Offseason");
		costprice= sc.nextDouble();
		discount=costprice*0.15;
		System.out.println("discount is:"+discount);
		PaidAmount=costprice-discount;
	System.out.println("Paid Amount is:"+PaidAmount);
	
}
}