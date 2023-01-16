package assign;

public class Assign02 {
	// access modifier static void  Name of method ()
	// {
	//  Action to be executed
	// }
	public static void  additionOfNumbers ()
	{
		int a = 436;
		int b =753;
		int c = a+b;
		System.out.println( "  Addition of  "+a+"  and  "+b+ "  is  "+ c);
	}
	
	public static void substractionOfNumbers() 
	{
		int e = 528;
		int f = 492;
		int g= f-e;
		System.out.println("      substraction of   "+ e + "   and   " + f + "   is   " + g);
		 }
	public static void multiplicationOfNumbers() 
	{
		float h = 145f;
		float i = 5392.68f;
		float j=h*i;
		System.out.println("     multiplication of   "+ h + "    and    "  +i+  " is   " + j);
		 }
	public static void dividationOfNumbers() 
	{
		float k = 9145f;
		float l = 7928f;
		float m= k/l;
		System.out.println("   dividation of   "+ k + "   and   " + l + "   is   " + m);
		 }
	public static void main(String[] args) 
	
	{    additionOfNumbers (); //Addition of  436  and  753  is  1189
		substractionOfNumbers(); //substraction of   528   and   492   is   -36
	multiplicationOfNumbers();// multiplication of   145.0    and    5392.68 is   781938.6
	dividationOfNumbers() ;//dividation of   9145.0   and   7928.0   is   1.1535065
	}
	}
