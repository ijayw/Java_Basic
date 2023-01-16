package mock;

public class Reversenum {
	
	public static void main(String[] args) {
		
        int a =1234;
		
	    int rem;
		
		int rev = 0;
		
		while(a!=0)
		{
			rem = a%10;
			rev = rem + (rev*10);
			a = a/10;
		}
		System.out.println("reverse number:"+rev);

	}

}
