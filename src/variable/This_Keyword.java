package variable;

public class This_Keyword {
	
	 int   a = 20;/// global variable
	 public void m1()
	 {
	   int a=56;
	   System.out.println(a);
	
		System.out.println(this.a);// used for calling non_static variable
	}
	
	 public static void main(String[] args) {
		 
		 This_Keyword gk = new This_Keyword();
		gk.m1();
	}
	 

}
 