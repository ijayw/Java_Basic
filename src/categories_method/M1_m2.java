package categories_method;
// method 1 will be add in method 2 get final out put
public class M1_m2 {
	public static int m1(int s , int i) 
	{
		   int ss =s+i;
				return ss;
	}
	
	public void m2(int b)
	{
		int s2 = b+2;
		System.out.println(s2);
	}
	
	public static void main(String[] args) {
		int val = m1(15, 1);
		M1_m2 mol = new M1_m2();
		mol.m2(val);
	}
	
	

}
