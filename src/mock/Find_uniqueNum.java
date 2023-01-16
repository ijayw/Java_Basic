package mock;

public class Find_uniqueNum {
	public static void main(String[] args) {
		
		int [] a =   {12,5,25,2,5,25,7,2,45,5};
        int cnt;
       System.out.println( "unique numbers in array:");
		for(int i=0;i<a.length;i++)
		{
			cnt=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					cnt++;
				}
				
			}
			if(cnt==1)
			{
				System.out.println(a[i]);
			}
			
		}

	}

 }
