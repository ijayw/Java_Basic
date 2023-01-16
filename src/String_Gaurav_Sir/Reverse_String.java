package String_Gaurav_Sir;
public class Reverse_String {
//	1. Write a program to reverse a String
	public static void main(String[] args) {
		
		String s = "Directinal";
		for (int i=s.length()-1;i>=0;i--)
		{
			char c=s.charAt(i);
			System.out.print(c);
		}

	}

}
