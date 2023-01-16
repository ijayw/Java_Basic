package assign;

public class Assign13_ReverseN {
	public static void main(String[] args)
	{
		int num = 12345,reverse=0;
		
		while (num!=0)// Reverse Number 12345
		{
			int remainder= num%10;
			reverse= reverse*10+remainder;
			num=num/10;
			
		}
		
  System.out.println("Reverse Number of 12345 is  "+reverse);
		
		
	}
	
	

}
