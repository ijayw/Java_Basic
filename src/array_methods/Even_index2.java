package array_methods;

public class Even_index2 {

	public static void main(String[] args) {
		
//		2.WAP to Print only odd index position elements
		
	int a[] = {10, 9, 7, 18, 13, 19, 4, 20, 21, 14} ;
	
	for(int i =0; i <a.length;i++)
	{
		if(i%2!=0)
		{
			System.out.println( i+")"+a[i]);
		}
	}
	}
}
