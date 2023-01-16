package categories_method;

public class Assign06_Calculator {
	public void C1(int a, int b) {
		int c = a+b;
		System.out.println("Addition of "+a+ " Plus "+b+ " is "+c  );
		}
	public void C2(int a, int b) {
		int c = a-b;
		System.out.println("Difference Between "+a+ " & "+b+ " is "+c  );
		}
	public void C3(int a, int b) {
		int c = a*b;
		System.out.println("Multiplication of "+a+ " of  "+b+ " is "+c  );
		}
	public void C4(double a, double b) {
		double c = b/a;
		System.out.println("Division of  "+b+ " & "+a+ " is "+c  );
		}
	public static void main(String[] args) {
		Assign06_Calculator c = new Assign06_Calculator();
		c.C1(10	, 20);
		c.C2(25, 56);
		c.C3(65, 95);
		c.C4(75, 63);
	}
}
