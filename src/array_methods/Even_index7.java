package array_methods;

public class Even_index7 {
	public static void main(String[] args) {
//5.2 WAP TO SORT AN ARRAY IN DECENDING ELEMENTS IN ORDERED.
		int a[] = {10, 9, 7, 18, 13, 19, 4, 20, 21, 14} ;
	    int SWAP;
	for(int i=0; i<a.length;i++)
	{
		for(int j=i; j<a.length;j++)
		{
			if(a[i] < a[j])
			{
				SWAP = a[i];
				a[i] = a[j];
				a[j] = SWAP;
			}
		}
	}
	for(int DESC:a) {
		System.out.println(DESC);
	}
	}
}
 