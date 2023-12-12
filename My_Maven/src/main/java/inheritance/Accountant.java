package inheritance;

public class Accountant extends Sales {

	int id=1002;
	String name="Rahul";
	public void details()
	{
		System.out.println("Employee id is:"+id);
		System.out.println("Employee name is:"+name);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Accountant  a=new Accountant();
		a.details();
		a.print();
		a.display();
	}

}
