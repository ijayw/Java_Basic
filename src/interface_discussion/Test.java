package interface_discussion;

public class Test implements interface1,interface2 {


	public void m2() {
	System.out.println("m2 method from test  ");
		
	}

	
	public void m4() {
		System.out.println("m4 method from test ");
		
	}

	public void m1() {
	
		System.out.println("m1 method from test ");
	}

	
	public void m3() {
		
		System.out.println("m3 method from test ");
	}


	public void m5() {
		System.out.println("m5 method from test ");
	}


public static void main(String[] args) {
	Test t = new Test ();
	t.m1();
	t.m2();
	t.m3();
	t.m4();
	t.m5();
	
	
	
}
		

}
