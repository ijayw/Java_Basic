package categories_method;

public class Return_nArgum {
	public static String m1()
	{  String s = " Velocity ";
	String s1 = s+" Corporation ";
	String s2 = s1+" Training ";
	String s3 = s2+" Center ";
	System.out.println(s);
	System.out.println(s1);
	System.out.println(s2);
	
	return  s3;
	}
public static void main(String[] args) {
	String a=m1();
	System.out.println(a);
}
}
