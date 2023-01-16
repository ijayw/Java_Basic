package method;
//                  
// 
public class static_non_static_method {

	public static void m1() {
		int a= 10;
	    int b = 20;
	    int c = a*b;
	    System.out.println("its static method  " + c);
		
	}
	public void m2() {
		
		int a= 50;
	    int b = 70;
	    int c = a*b;
	    
		System.out.println("its non_static method "+c);
	}
	
	public static void main(String[] args) {
		m1();
		
		static_non_static_method n = new static_non_static_method();
		n.m2();		
}

}     
