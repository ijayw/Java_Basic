package calling_method;

public class Calling_Nsm_Nsm {
	
	
	public void n1() {
		
		n2();
		
	}

	
	public void n2() {
		System.out.println("“Software testers succeed where others fail.”");
		
	}
	
	
	public static void main(String[] args) {
		
		Calling_Nsm_Nsm ref = new Calling_Nsm_Nsm();
				
		ref.n2();
		ref.n1();
		 
	}
}
