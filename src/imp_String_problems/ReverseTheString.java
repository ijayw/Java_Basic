package imp_String_problems;

public class ReverseTheString {
	public static void main(String[] args) {
		
		String s = "ajncjni";
		String rev = "";
		
		for (int i = (s.length()-1);i>=0;i--)
		{
			rev = rev+ s.charAt(i);
		}
		System.out.println("The reverse string is "+ rev);

	}

   }
