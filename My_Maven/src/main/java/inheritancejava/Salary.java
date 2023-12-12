package inheritancejava;
public class Salary extends Employee {
double hra;
double pf;
public void calculate()
{
	hra=basicpay*0.05;
	 pf=basicpay*0.2; 
	
	
}
}
