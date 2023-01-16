package exception_discussion;

public class Try_catch {
	public static void main(String[] args) {
		
		try 
		{
			int a = 10;
			int b = 0;
			int c = a/b;
			System.out.println(c);
			
		}
		catch(ArithmeticException e )
		{
	System.out.println("its Arithmetic exception value is Infinity");
	
		}
	
	}
	
	

}
