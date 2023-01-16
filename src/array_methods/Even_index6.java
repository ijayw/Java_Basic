package array_methods;

public class Even_index6 {
	public static void main(String[] args) {
//5.1 WAP TO SORT AN ARRAY IN ASCENDING ORDERED.
		int a[] = {10, 9, 7, 18, 13, 19, 4, 20, 21, 14} ;
	    int SWAP;
	for(int i=0; i<a.length;i++)
	{
		for(int j=i+1; j<a.length;j++)
		{
			if(a[i] > a[j])
			{
				SWAP = a[i];
				a[i] = a[j];
				a[j] = SWAP;
			}
		}
	}
	for(int ASC:a) {
		System.out.println(ASC);
	}
	}
}
 