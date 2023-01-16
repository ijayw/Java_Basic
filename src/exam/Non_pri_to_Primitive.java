package exam;

public class Non_pri_to_Primitive {
//  Non Primitive to Primitive convert by using parse
	
	public static void main(String[] args) {
		String s = "150";
		int s1 = Integer.parseInt(s);
		System.out.println(s1);
		
		String s2 = "98.58";
	float s3 = Float.parseFloat(s2);
		System.out.println(s3);
		
		String s4 = "Velocity";
	boolean s5 = Boolean.parseBoolean(s4);
		System.out.println(s5);// false
		
		
		
	}
	
	
}
