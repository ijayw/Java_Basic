package stringdiscussion;

public class A1 {
	
public static void main(String[] args) {
	
	String s= "Philadelphia";
	int count =0;
	for(int i=0 ; i<s.length(); i++)
	{
		 char s1 = s.charAt(i);
		 
		 if(s1=='a')
		 {
			 count++;
		 }
	}
	System.out.println(count);
	
	
	
	
	
}

}
