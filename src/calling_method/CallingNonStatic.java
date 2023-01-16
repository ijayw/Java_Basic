package calling_method;

public class CallingNonStatic 
{
	
	public void z1() 
	
	{ 
		System.out.println("जीवनात चांगल्या माणसांना शोधू नका,");
		System.out.println("स्वतः चांगले व्हा आणि कुणीतरी तुम्हाला शोधत येईल.");
		
	}
	
	public static void z2() {
		CallingNonStatic cns = new CallingNonStatic();
		cns.z1();
		
	}

	public static void main(String[] args) {
		z2();
		
	}
	
	
	
}
