 package categories_method;

public class Return_Argu {
	
	public int m1(int a,int b) 
	{
		int c = a*b;
		return c;
	}
	
public static void main(String[] args) {
	Return_Argu na = new Return_Argu();
	
	int a = na.m1(10, 10);
	int b = na.m1(20, 20);
	System.out.println(a);
	System.out.println(b);
	
	
	
	
}
}
