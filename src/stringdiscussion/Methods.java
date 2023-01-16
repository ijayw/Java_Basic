package stringdiscussion;

public class Methods {
	
	public static void main(String[] args) {
//		3.equals(String s)
		String s1 = "Velocity";
		String s2 = "Velocity";
		
		boolean s3 = s1.equals(s2);
		System.out.println(s3);
		
		System.out.println("*************");
		
//		4.equalsIgnoreCase(String s)
		String s4 = "Velocity";
		String s5 = "velocity";
		boolean s6 = s4.equalsIgnoreCase(s5);
		System.out.println(s6);
		System.out.println("*************");
		
//		5.Concat(String s):	
		
		String s7 = "Viman";
		String s8 = "Nagar";
		String s9 = s7.concat(s8);
		System.out.println(s9);
		System.out.println("*************");
		
//		6.subString(int index)
		String s10 = "Punecity";
		String s11 = s10.substring(4);
		System.out.println(s11);
		System.out.println("*************");
		
//		7.subString(int beginindex, int endindex)
		String s12 = "Narmadapuram";
	    String s13 = s12.substring(0, 7);
		System.out.println(s13);
		System.out.println("*************");
		
//		8.replace(char old, char new);
		String s14 = "promesh";
		String s15 = s14.replace('p', 'r');
		System.out.println(s15);
		System.out.println("*************");
		
		
//	    9.replace() 	
		String s16 ="punecity";
		String s17 = s16.replaceAll("city", "Mahanagar");
		System.out.println(s17);
		System.out.println("*************");
		
//		10.trim()
		String s18 = "   this   is string       ";
		String s19 = s18.trim();
		System.out.println(s19);
		System.out.println("*************");
		
	}

}
