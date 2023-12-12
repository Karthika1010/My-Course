package interfacesample;

public class Class2 implements InterfaceSample1 {

	public void display()
	{
		System.out.println("hello World");
		System.out.println("number is:"+NUM);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Class2 c=new Class2();
		c.display();
	}

}
