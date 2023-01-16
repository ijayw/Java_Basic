package string;

public class Reverse_String {

	public static void main(String[] args) {
		
		String s = "velocity";
		
	
		 for (int i=s.length()-1; i>=0 ; i--)
		 {
			 char c = s.charAt(i);		
				System.out.print(c);
		 }
 
	}
	
}
