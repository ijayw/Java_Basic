package charecter;

public class Ordercheck {
	public static void main(String[] args) {
		char a = '{';
		char b = '}';
		int c = a;
		int d = b;
	System.out.println("open curlybracket ASCII value is "+c);
	System.out.println("close curlybracket ASCII value is "+d);

	if(a<b)
	{
		System.out.println("correct order is { }");
	}
	else
	{
		System.out.println("correct order is } { ");
	}
	}

}
