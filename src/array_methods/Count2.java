package array_methods;

public class Count2 {

//	02.WAP to count the number of capital letter(upper case) inside a String- "HelLO"
	public static void main(String[] args) {
		String s = "HelLO";
		count(s);
	}
	public static void count(String s) {
		char[] ch = s.toCharArray();
		int cap=0;
		
		for(int i=0;i<s.length();i++)
		{
			
			if(Character.isUpperCase(ch[i]))
			{
				cap++;
			}
		}
		System.out.println("HelLO");
		System.out.println("Count Num_cap are:"+cap);

	}

}
