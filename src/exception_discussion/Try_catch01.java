package exception_discussion;

public class Try_catch01 {
	
	public static void main(String[] args) {
		
        try
        {
        	int a= 10;
        	int b =0;
            int c =a/b;
    		
        }
		catch(ArithmeticException e)
        {
			System.out.println("its interruped exception");	
			String message = e.getMessage();
			System.out.println(message);
        }
		
	}

}
