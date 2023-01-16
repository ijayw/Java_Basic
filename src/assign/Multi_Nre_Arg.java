package assign;

public class Multi_Nre_Arg
{

	public void multi(int a, int b) 
	{
		int c = a*b;
		System.out.println(" Non Static multiplication of    " +    a    + "   &    " +   b    + "   is   "   + c);
	}
	
	
	public static void multi02(int a , int b ) 
	{  int c = a*b;
	System.out.println("Static multiplication of    " +    a    + "   &    " +   b    + "   is   "   + c);
		
	}
	public static void main(String[] args) {
		Multi_Nre_Arg v = new Multi_Nre_Arg();
		v.multi(10, 20);
		v.multi(15, 15);
	     v.multi(45, 15);
	     
	     multi02(26, 35);
	     multi02(45, 96);
	     
	     
	     
	     
	     
		
		
	}
	
	
	
}
