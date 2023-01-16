package assign;

public class Calculator {
	
	public void CXal(int a, int b)
	{
		int c = a+b;
	    int d=b*a;
	    int e = b-a;
	    int f = b/a;
	System.out.println("  Addition of "+ a + "  &  "+ b + "  is  "+c);
	System.out.println("  Multiplication of "+ a + "  &  "+ b + "  is  "+d);
	System.out.println("  Difference of   "+ a + "  &  "+ b + "  is  "+e);
	System.out.println("  Division of   "+ b + "   &   "+ a + "  is   "+f);	
	System.out.println();
	}
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.CXal(10, 10);
	    c.CXal(25, 50);
	    c.CXal(15, 45);
	}

}
