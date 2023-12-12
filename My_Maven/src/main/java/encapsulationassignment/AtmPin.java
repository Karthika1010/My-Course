package encapsulationassignment;

public class AtmPin {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		Atm a=new Atm();
		a.setPin1(1001);
		a.setPin2(1234);
		a.setPin3(1212);
		a.check();
		System.out.println(a.getPin1());
		System.out.println(a.getPin2());
		System.out.println(a.getPin3());


	}

}
