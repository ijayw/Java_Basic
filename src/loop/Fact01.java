package loop;

public class Fact01 {
	
	public static void Factorial(int num) 
	{  
		int i,fact=1;
		int number=num;// its number to calculate factorial
		
		for(i=1;i<=number;i++)
		{
			fact=fact*i;
		}
		
		System.out.println(" factorial of "+ number+ "!"+" = "+fact);
	}
public static void main(String[] args) {
	Factorial(5);
	Factorial(4);
	Factorial(6);
	Factorial(10);
}
}
