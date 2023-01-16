package calling_method;
//Calling of Static method into Static method
public class CallingStatic{
	
	public static void m1() 
	{
		
	System.out.println(" m1 static method ");
	m2();
		
	}
	
	
	public static void m2()
	{
		System.out.println("m2 static method ");
		
	}
	
	public void m3()
	{
		System.out.println("m3 is non static method");
	}   // calling of static method into non static method
	
	public static void main(String[] args) {
		m1();    
		CallingStatic csm = new CallingStatic();
		csm.m3();
		
	}
	

}
