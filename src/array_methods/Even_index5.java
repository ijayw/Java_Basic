package array_methods;

public class Even_index5 {
	public static void main(String[] args) {
//5.WAP TO SORT AN ARRAY IN ASCENDING && DECENDING ORDERED.
	int [] a = new  int [10];
	a[0] = 10;
	a[1] = 9;
	a[2] = 7;
	a[3] = 18;
	a[4] = 13;
	a[5] = 19;
	a[6] = 4;
	a[7] = 20;
	a[8] = 21;
	a[9] = 14;
	int swap;
	
	for(int i=0; i<a.length;i++)
	{
		for(int j=i; j<a.length;j++)
		{
			if(a[i] > a[j])
			{
				swap = a[i];
				a[i] = a[j];
				a[j] = swap;
			}
		}
	}
	for(int ASC:a) {
		System.out.println(ASC);
	}
	
	}
}
 