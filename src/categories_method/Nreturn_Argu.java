package categories_method;

public class Nreturn_Argu {
	
	public void Addition(int a, int b ) 
	{
		int c = a+b;
		
		System.out.println(c);
	}

	public static void Multi(int a, int b)
	{
		int c= a*b;
		System.out.println(c);
	}
	
	
	public static void main(String[] args) {
		Nreturn_Argu nra = new Nreturn_Argu();
		nra.Addition(15, 10);
		nra.Addition(20, 15);
		nra.Addition(25, 25);
		nra.Addition(50, 25);
		Multi(45, 100);
		Multi(25, 25);
		
	}
}
