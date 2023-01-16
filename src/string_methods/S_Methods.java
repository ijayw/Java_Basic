package string_methods;

public class S_Methods {
	public static void main(String[] args) {
//	1.length
		String s = "Srilanka_team";
		String sp = "Sri123lanka_##$$%%^team";
		String s0 = "SRILANKA";
		
		int s1 = s.length();
		System.out.println(s1);
		System.out.println("********************");
//		2.charAt
		
		char s2 = s.charAt(2);
		System.out.println(s2);
		
//		3.indexof
		int s3 = s.indexOf('a');
		System.out.println(s3);
		
//		4.equals
		boolean s4 = s.equals(s0);
		System.out.println(s4);
		
//		5.equalignore
		boolean s5 = s.equalsIgnoreCase(s0);
		System.out.println(s5);
		
//		6.concat
		String s6 = s.concat("the ckicket team");
		System.out.println(s6);
//		7.subString(start)
		String s7 = s.substring(3);
		System.out.println(s7);
		
//	8.	subString(start,end)
		String s8 = s.substring(2,8);
		System.out.println(s8);
		
//		9.replace()
		String s9 = s.replace('S','P');
		System.out.println(s9);
		
//		10.replace(string)
		String s10 = s.replace("lanka", "ram");
		System.out.println(s10);
		
//		11. trim- reomve starting & trailling elements
		String s11 = s.trim();
		System.out.println(s);
		System.out.println("********");
		System.out.println(s11);
		
//		12.contains
		 boolean s12 = s.contains("lanka");
		System.out.println(s12);
		
//		13.tolowercase(smallletter)
		String s13 = s.toLowerCase();
		System.out.println(s13);
		String s14 = s0.toLowerCase();
		System.out.println(s14);
		
//		14.touppercase(capitalletter)
		String s15 = s.toUpperCase();
		System.out.println(s15);
		System.out.println("********");
		
//		15.split
		String[] s16 = s.split("a");
		for(String s17:s16)
		{
			System.out.println(s17);
		}
//		16.startWith
		boolean s18 = s.startsWith("Sri");
		System.out.println(s18);
		
//		17.endswith
		boolean s19 = s.endsWith("team");
		System.out.println(s19);
		
//		18.isalphabetic
		char c = 'i';
		boolean s20 = Character.isAlphabetic(c);
		System.out.println(s20);
		
//		18.isdigit
		char c1 = '9';
		boolean s21 = Character.isDigit(c1);
		System.out.println(s21);
//		19.replaceAll
		String s22 = sp.replaceAll("[A-Z]","p" );
		System.out.println(s22);
		
		String s23 = sp.replaceAll("[A-Za-z]","p" );
		System.out.println(s23);
		
		String s24 = sp.replaceAll("[A-Za-z0-9]","p" );
		System.out.println(s24);
		
		String s25 = sp.replaceAll("[A-Za-z0-9]","" );
		System.out.println(s25);
		
		String s26 = sp.replaceAll("[^A-Za-z]"," " );
		System.out.println(s26);
		
		String s27 = sp.replaceAll("[^A-Za-z]","" );
		System.out.println(s27);
		
//		20.conversion of primitive to non primitive
		
		int s28 = 45;
		String s29 = String.valueOf(s28);
		System.out.println(s29);
		
		
		
//		21.conversion of non_primitive to primitive
		String s30 = "352663";
		int s31= Integer.parseInt(s30);
		System.out.println(s31);
		
//		22.Array
//		synatax : datatype[]variable name=new datatype[];
        
		int[]a = new int[5];
		a[0]=15;
		a[1]=45;
		a[2]=65;
		a[3]=87;
		a[4]=26;
		
		for(int i = 0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("**");
		
		for(int a1:a)
		{
			System.out.println(a1);
		}
		
		System.out.println("**");
//		23.tochararray

		
		
		char [] s33= s.toCharArray();
		
		for(char s34 :s33)
		{
			System.out.println(s34);
		}


	
		
		
		
		
		
		
		

		
		
		
	}
	
	

}
