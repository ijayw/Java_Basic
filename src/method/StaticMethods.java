package method;

public class StaticMethods {
	
	// Access_Modifier Static Void Name_of_Method()
	 //{
	//	   Action to be Executed
	//	}
	
public static void  additionOfNumbers ()
{
	int a = 10;
	int b = 20;
	int c = a+b;
	System.out.println( "  Addition of  "+a+"  and  "+b+ "  is  "+ c);
}

public static void main(String[] args) {
	
	            additionOfNumbers ();
	            System.out.println("Execute the methods for 2 times");
	            additionOfNumbers ();
	            additionOfNumbers();
	           
}

	
}
