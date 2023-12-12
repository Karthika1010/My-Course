package encapsulationassignment;

public class Atm {
	int pin1;
	int pin2;
	int pin3;
	public int getPin1() {
		return pin1;
	}
	public void setPin1(int pin1) {
		this.pin1 = pin1;
	}
	public int getPin2() {
		return pin2;
	}
	public void setPin2(int pin2) {
		this.pin2 = pin2;
	}
	public int getPin3() {
		return pin3;
	}
	public void setPin3(int pin3) {
		this.pin3 = pin3;
	}
	public void check() {
		if(pin1==1001||pin2==1234||pin3==1212)
		{
			System.out.println("valid pin numbers");
		}
		else
		{
			System.out.println("not a valid pin numbers");
		}
	}
}
