package loop;

public class Prime11_111 {
	
	public static void main(String[] args) {
		int temp = 0 ;
		
		for(int n=11; n<=111;n++)
		{
			for(int i = 11; i<=n-1 ;i++)
			{
				if(n%i==0)
				{
					temp=temp+1;
				}
				
			}
			if(temp==0)
			{
				System.out.print(n +" ,");
			}
			else
			{
				temp=0;
			}
			
		}

	}

}
