package String_Gaurav_Sir;
public class Addition_of_Integer_String {
//	2. Write a program to addition of the integers available in the string:
	public static void main(String[] args) {
		
		String s= "bj66kbi47179";
		
		int sum =0;
		
		for(int i=0;i<s.length();i++)
	{
			if(Character.isDigit(s.charAt(i)))
	      {
	sum=sum+Integer.parseInt(String.valueOf(s.charAt(i)));
				
	      }

	}
  System.out.println("Addition of all integers present in String :"+sum);	

      }

  }
