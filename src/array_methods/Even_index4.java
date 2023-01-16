package array_methods;

public class Even_index4 {
	public static void main(String[] args) {
//4.WAP to Print the "sum" of the elements which are "EVEN Numbers".
		
	int a[] = {10, 9, 7, 18, 13, 19, 4, 20, 21, 14} ;
	int sum =0;
	for(int i =0; i <a.length;i++)
	{
		if(a[i]%2==0)
		{
			sum = sum +a[i];
			System.out.println(i+")"+a[i]);
		}
	}
	
	System.out.println(" i.e sum of total even NUM= "+ sum);
	} 
	}
 