package inheritancestudies;

public class Rob2 extends Robot{

	public void Dance()
	{
		System.out.println("robot can dance");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Rob2 r2=new Rob2();

r2.Dance();
//r2.sing();
r2.walk();
r2.talk();

	}

}
