package loop;

public class fact02 {
	
	public void factor(int num) 
	{
		int i, fact=1;
		int number=num;// its number to calculate factorial
		
		for(i=1;i<=number;i++)
		{
			fact=i*fact;
		}
		System.out.println("factorial of "+number+"! = "+fact);
	}
public static void main(String[] args) {
	fact02 f = new fact02();
	f.factor(5);
	f.factor(4);
}
}
