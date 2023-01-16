package comparaOpe;

public class Equal_Or_Not {
	
	public static void compare(int a, int b, int c, int d)
	{
		if(a==b  && b==c && c==d)
		{
			System.out.println();
			System.out.println("All numbers are same");
		}
		else
		{
			System.out.println();
			System.out.println("All numbers are not same");
		}
		
		}
	public static void main(String[] args) {
		compare(10, 10, 10, 10);
		compare(10, 12, 22, 10);
		compare(20, 20, 20, 21);
		
		
	}
}
