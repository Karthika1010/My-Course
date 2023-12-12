package encapsulation;

public class Display {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
EmployeeDetails e=new EmployeeDetails();
e.setAcc_no(123456);
e.setName("Rahul");
System.out.println("Acc_no is:"+e.getAcc_no());
System.out.println("Name is:"+e.getName());	
	}

}
