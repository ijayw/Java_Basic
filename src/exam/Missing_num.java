package exam;

import java.util.Arrays;

public class Missing_num {
	public static void main(String[] args) {
		
		int a[] = {11,12,13,15,16};
		
		Arrays.sort(a);
		
		for(int i=0;i<a.length;i++)
		{
			if(!(a[i]+1==a[i+1]))
			{
				System.out.println(a[i]+1);
			    break;
			}
		}

	}


	}
	
	


