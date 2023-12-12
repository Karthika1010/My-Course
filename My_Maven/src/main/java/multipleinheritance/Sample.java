package multipleinheritance;

public class Sample implements C {

	public void print()
	{
		System.out.println("hi");
	}
	public void  display()
	{
		System.out.println("welcome");
	}
	public  void msg()
	{
		System.out.println("Hello");
	}
	public   void details()
	{
		System.out.println("multiple inheritance");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sample d=new Sample();
		d.print();
		d.display();
		d.msg();
		d.details();
	}

}
