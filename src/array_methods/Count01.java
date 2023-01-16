package array_methods;

public class Count01 {
	
//	WAP to count the number of numeric characters inside a String- "Ph2o2e5n90ix"
public static void main(String[] args) {
	String str = "Ph2o2e5n90ix";
	count(str);
}
public static void count(String s) {
	char[] ch = s.toCharArray();
	int num=0;
	
	for(int i=0;i<s.length();i++)
	{
		
		if(Character.isDigit(ch[i]))
		{
			num++;
		}
	}
	System.out.println("Ph2o2e5n90ix");
	System.out.println("count of num:"+num);
	
	
	
	
	
	
}
}
