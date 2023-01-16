package assign;

public class Assign08_M1_m2 {
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
		Assign08_M1_m2 mol = new Assign08_M1_m2();
		mol.m2(val);
	}
	
	

}
