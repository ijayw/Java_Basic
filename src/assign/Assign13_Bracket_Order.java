package assign;

public class Assign13_Bracket_Order {
	
	public static void main(String[] args) {
		
		char a = '(';
		char b = ')';
		
		int c = a;
		int d = b;
		System.out.println("open bracket ASCII value is "+c);
		System.out.println("close bracket ASCII value is "+d);
		
		if (a<b)
		{
			System.out.println("correct order is ( )");
		}
		else
		{
			System.out.println("correct order is )(");
		}
	}
}
