package abstraction;

public class AbstractSample1 extends AbstractionSample {

	public  void show()
	{
		System.out.println("implementation of abstract method");
	}
	public void msg()
	{
		System.out.println("hai");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
AbstractSample1 a=new AbstractSample1();
a.show();
a.msg();
a.display();
	}

}
