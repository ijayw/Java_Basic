package categories_method;

public class Nreturn_Argu01 {
public void Multi01(double a, double b) 
	{
		double c = a*b;
		System.out.println("multiplication of    " +    a    + "   &    " +   b    + "   is   "   + c);
		System.out.println("Square root of "+ c + " is " + Math.sqrt(c));
		System.out.println("Logarithm of    " + c+ "   is   " + Math.log(c));
	}
	public static void Multi02(double a, double b)
	{
		double c = a*b;
		System.out.println("multiplication of    " +    a    + "   &    " +   b    + "   is   "   + c);
		System.out.println("Square root of "+ c + " is " + Math.sqrt(c));
		System.out.println("Logarithm of    " + c+ "   is   " + Math.log(c));
	}
	public static void main(String[] args) {
		Nreturn_Argu01 nra = new Nreturn_Argu01();
		nra.Multi01(12, 12);
		Multi02(25, 25);
		} 
	}
