package loop;

public class prime_10 {
public static void main(String[] args) {
//	WAP print prime number under 100	
		int temp=0;
		for(int n = 2; n<=100; n++)
		{
			for(int i=2; i<=n-1; i++)
			{
				     if(n%i==0)
				     {
				    	 temp=temp+1;
				     }
			}
			if(temp==0)
			{
				System.out.println(n);
			}
			else
			{
				temp=0;
			}
			 
		}
	
		}
	
        }



