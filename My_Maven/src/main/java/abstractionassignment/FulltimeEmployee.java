package abstractionassignment;
import java.util.Scanner;
public class FulltimeEmployee extends Employee {
@Override
	public void calculatesalary() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the payment per hour");
		int r=sc.nextInt();
		double salary=r*8;
		System.out.println("total salary per day:"+salary);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e=new FulltimeEmployee();
		e.calculatesalary();
		Employee c=new Contractor();
		c.calculatesalary();
	
}
}