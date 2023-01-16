package string_discussion;

public class Assign01 {
	
	public static void main(String[] args) {
		String s= "arora";
		String rev ="";
		for(int i=s.length()-1;i>=0;i--)
		{
			char s1 = s.charAt(i);
			rev = rev + s1;
		}
		
		if(s.equalsIgnoreCase(rev))
		{
			System.out.println("its palindrome   ");
		}
		else
		{
			System.out.println("its not palindrome");
		}
	
     System.out.println(rev);
	}

}
