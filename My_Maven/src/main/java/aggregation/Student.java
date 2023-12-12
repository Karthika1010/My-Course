package aggregation;

public class Student {
	
	int rollno;
	String Name;
	Address a;
	public Student(int rollno,String Name,Address a)
	{
	this.rollno=rollno;
	this.Name=Name;
	this.a=a;
	}
	public void display()
	{
	System.out.println("rollno is:"+rollno);
	System.out.println("name is:"+Name);
	System.out.println("House no is:"+a.houseno);
	System.out.println("House name is:"+a.housename);
	System.out.println("city is:"+a.city);
	System.out.println("pincode is:"+a.pincode);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Address a1=new Address(1345,"Nandanam","Kottayam",686547);
Student s=new Student(101,"karthika",a1);
s.display();
		
	}

}
