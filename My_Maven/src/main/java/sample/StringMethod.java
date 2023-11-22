package sample;

public class StringMethod {

	
public void checkpalindrome(String str)

{
  
	StringBuilder s = new StringBuilder(str);
    s.reverse();
    String rev = s.toString();
    if(str.equals(rev)){
       System.out.println("Given String is palindrome");
    } 
    else {
       System.out.println("Given String is not palindrome");
    }
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringMethod obj=new StringMethod();
		obj.checkpalindrome("java");
		obj.checkpalindrome("malayalam");
		
	}
}
	
	

