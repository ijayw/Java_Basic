package mock;

public class UniqueNum {
	public static void main(String[] args) {
		
		int [] a =  {12,5,25,2,5,25,7,2,45,5};
		for(int i =0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
       		
		System.out.println("_________________");
		
		System.out.println("unique elements in array");
		
		System.out.println();
		
		int cnt;
		
		for(int i=0;i<a.length;i++)
		{
			cnt=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j] && i!=j)
				{
					cnt =1;
					break;
				}
				
			}
			if(cnt==0)
			{
				System.out.println(a[i]);
			}
			
		}
		
		
		
		
	}

}
