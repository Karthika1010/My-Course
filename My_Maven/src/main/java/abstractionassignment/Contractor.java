package abstractionassignment;
import java.util.Scanner;
public class Contractor extends Employee {

		// TODO Auto-generated constructor stub
	

	@Override
	public void calculatesalary() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the payment perhour");
		int p=sc.nextInt();
		System.out.println("Enter working  hours");
		int h=sc.nextInt();
		double salary=p*h;
		System.out.println("total salary is:"+salary);
		
		
	}

	
	}



