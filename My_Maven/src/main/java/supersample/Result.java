package supersample;

public class Result extends Sum {
	public void check()
	{
		int num=super.add(250,150);
		if(num%10==0)
		{
		
			System.out.println("number is divisible");
			}
		else
		{
			
			System.out.println("number is not divisible");
			}
}

public static void main(String[] args) {
	// TODO Auto-generated method stub
   Result r=new Result();
   r.check();
}
}

