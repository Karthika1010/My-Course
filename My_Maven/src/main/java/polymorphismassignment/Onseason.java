package polymorphismassignment;
import java.util.Scanner;
public class Onseason extends Offseason {
public void discount()
{
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the cost price for Onseason");
	costprice= sc.nextDouble();
	discount=costprice*0.4;
	System.out.println("discount is:"+discount);
	PaidAmount=costprice-discount;
	System.out.println("Paid Amount is:"+PaidAmount);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.out.println("Choose any option\n1.OffSeason\n2.OnSeason\n3.Exit");
		  Scanner sc = new Scanner(System.in);
		  int option = sc.nextInt();
		  
		  switch(option){
		  case 1:
		   Offseason s1 = new Offseason();
		   s1.discount();
		   break;
		  case 2:
		   Onseason s2 = new Onseason();
		   s2.discount();
		   break;
		  case 3:
		   System.out.println("exited");
		   break;
		  default:
		   System.out.println("Inavlid input");
		   break;
		  }
		 }
		}