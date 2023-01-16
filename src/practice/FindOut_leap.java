package practice;

public class FindOut_leap {
//	wap to find out leap year
	public static void main(String[] args) {
		
		int []a = {2022,2004,2008,2016,2022,2000,2001};
		
		for(int i=0;i<a.length;i++)
		{
			if(i%4==0)
			{
				System.out.println("its leap year"+a[i]);
			}
			else
			{
				System.out.println("not leap year"+a[i]);
			}
		}

		
	}

}
