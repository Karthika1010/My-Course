package inheritancejava;

public class TotalSalary extends Salary {
	double totalsalary;
public void totalsalary()
{
	 totalsalary=basicpay + hra - pf - deduction + bonus;
}
public void display()
{
	System.out.println("basicpay is:"+basicpay);
	System.out.println("deduction is:"+deduction);
	System.out.println("bonus is:"+bonus);
	System.out.println("hra is:"+hra);
	System.out.println("pf is:"+pf);
	System.out.println("totalsalary is :"+totalsalary);
	
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TotalSalary t=new TotalSalary();
t.details();
t.calculate();
t.totalsalary();
t.display();
		
	}

}
