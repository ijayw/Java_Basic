package exception_discussion;
// Its Stackoverflow Error
public class Error_defic {
	public void m1() 
	{
		System.out.println("m1 is non static method");
		m2();
	}

	public void m2() 
	{
		System.out.println("m2 is another method");
		m1();
	}
	public static void main(String[] args) {
		Error_defic ed = new Error_defic();
		ed.m1();
	}
}
