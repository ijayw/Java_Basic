package stringdiscussion;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String j = "Jaykumar";
		int rev = j.length()-1;
		
		
		for(int k=rev;k>=0;k--)
		{
			char m = j.charAt(k);
			rev = rev+m		;
		}
		
			System.out.println(rev);	
	}
	
	

}
