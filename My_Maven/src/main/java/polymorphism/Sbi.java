package polymorphism;

public class Sbi extends Bank{

	
	
float interestsbi=10.5f;
	public void interest(){
		System.out.println("interest:"+interestsbi);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank b=new Sbi();
		b.interest();
		Bank obj=new Bank();
		obj.interest();
	}

}
