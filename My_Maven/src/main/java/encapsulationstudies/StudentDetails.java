package encapsulationstudies;

public class StudentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.setRoll_no(120);
		s.setName("Karthika");
		s.setDepartment("CSE");
		System.out.println("Roll no is:"+s.getRoll_no());
		System.out.println("Name is :"+s.getName());
		System.out.println("Department is:"+s.getDepartment());
		

	}

}
