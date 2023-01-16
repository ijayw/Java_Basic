package exception_discussion;

public class Array_exception {
	public static void main(String[] args) {
	    	
		  try
		  {
			  System.out.println(" first line of try block");
			  int a[]= {1,3,6,9,8,10};
			  System.out.println(a[10]);
			  System.out.println("last line of try block");
		  }
		  catch(ArithmeticException e)
		  {
			  System.out.println("its arithmatic exception");
		  }
		 catch(NullPointerException e)
		  {
			 System.out.println("its nullpointer exception");
		  }
	 	catch(ClassCastException e)
		  {
	 		System.out.println("its classcast exception");
		  }
		  catch (IndexOutOfBoundsException e)
		  {
			  System.out.println("its IndexOutOfBounds Exception");
		  }
		
		
		
		
		
		
	}

}
