package memory_management01;

public class D extends E {
	
	
	public void m10() {
		
		 a.m1();
		 b.m6();
		 c.m9();
		
	}
	
	
	public void m11() {
		
		a.m1();
		c.m9();
		
	}
	
	
	public static void main(String[] args) {
		D d = new D();
		d.m10();
		d.m11();
		
		
	}

}
