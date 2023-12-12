package hierarchicalinheritance;

public class Test3 extends Test1 {

	public void msg2()
	{
		System.out.println("hello world");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test3 obj=new Test3();
		
		obj.msg();
		obj.msg2();
	}

}
