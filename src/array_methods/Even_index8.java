package array_methods;

import java.util.Arrays;

public class Even_index8 {
	public static void main(String[] args) {
		//6 WAP find_out missing number ARRAY IN ASCENDING ORDERED.
//		
		 int [] a = {1,2,3,5,6};
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			if(!(a[i]+1 == a[i+1]))
			{
				System.out.println(a[i]+1);
				break;	
			}
		}
		
	}
}
		  

	
		 