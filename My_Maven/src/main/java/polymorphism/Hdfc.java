package polymorphism;

public class Hdfc extends Bank {

	float interesthdfc=12.5f;
	public void interest()
	{
		System.out.println("interest:"+ interesthdfc);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank b=new Bank();
		b.interest();
		Hdfc h=new Hdfc();
		h.interest();
		Sbi s=new Sbi();
		s.interest();
	}

}
