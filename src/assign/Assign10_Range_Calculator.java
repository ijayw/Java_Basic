package assign;

public class Assign10_Range_Calculator {
	
	public static void check(int i)
	{
		if (i>1 && i <= 20)
		{
			System.out.println(i+ " is in range of 1 to 20");
		}
		if (i>20 && i <= 40)
		{
			System.out.println(i+ " is in range of 20 to 40");
		}
		if (i>40 && i <= 60)
		{
			System.out.println(i+ " is in range of 40 to 60");
		}
		if (i>60 && i <= 80)
		{
			System.out.println(i+ " is in range of 60 to 80");
		}
		
         }
     public static void main(String[] args) {
    	 
    	 check(15);
    	 check(60);
    	 check(52);
    	 check(26);
    	 check(84);
	
}
}
