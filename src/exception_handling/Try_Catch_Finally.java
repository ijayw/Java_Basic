package exception_handling;

public class Try_Catch_Finally {
	
public static void main(String[] args) {
	
	   try
	   {int a=10;
		
		int b=0;
		
		int c= a/b;

		System.out.println(c);
	   }
	     catch(ArithmeticException e)
	   {
	    	 String message = e.getMessage();
	    	 System.out.println(message);
	   }
	     finally
	     {
	    	 System.out.println(" finallay the value of c = infinity");
	     }
	
	
	
	
	
	
	
}

}
