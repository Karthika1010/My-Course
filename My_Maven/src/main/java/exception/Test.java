package exception;

public class Test {

	public static void validate(int age) throws LicenseException {  
        if(age<18) {  
              
            throw new LicenseException("Person is not eligible to license");    
        }  
        else {  
            System.out.println("Person is eligible to license");  
        }  
    }  
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			validate(15);
		}
		catch(LicenseException e )
		{
		System.out.println(e);	
		}
	}

}
