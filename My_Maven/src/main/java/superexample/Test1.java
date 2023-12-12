package superexample;

public class Test1 extends Test {

	public Test1(float a,float b)
	{
		super(12,10);
		float c=a+b;
		System.out.println("sum is:"+c);
		
	}
	public void display()
	{
		super.display();
		System.out.println("age is:"+super.age);
		System.out.println("child class method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test1 t=new Test1(12.5f,10.5f);
t.display();

	}

}
