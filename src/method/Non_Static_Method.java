package method;

public class Non_Static_Method {
// syntax:
	
//          access_modifer void method name()
//    {
//
//    }
	
     public  void  addition ()
	{
		int a = 456;
		int b = 149;
		int c = a+b;
		
		System.out.println( "  Addition of  "+a+"  and  "+b+ "  is  "+ c);
	
	}
	public  void  sub ()
	{
		int a = 456;
		int b = 149;
		int c = a-b;
	
		System.out.println( "  difference of  "+a+"  and  "+b+ "  is  "+ c);
		
	
	}
	public  void  multi ()
	{
		int a = 456;
		int b = 149;
		int c = a*b;
		
		System.out.println( "  multi of  "+a+"  and  "+b+ "  is  "+ c);
	
	}
	public  void  div ()
	{
		float a = 456f;
		float b = 149f;
		float c = a/b;
		
		System.out.println( "  div of  "+a+"  and  "+b+ "  is  "+ c);
	
	}
	
	public static void main(String[] args) {
//		object creation
//		
//		class name variable name = new _Classname();
//		
		Non_Static_Method var = new Non_Static_Method( );
		var.addition();
		var.sub();
		var.multi();
		var.div();
		
	}


}
