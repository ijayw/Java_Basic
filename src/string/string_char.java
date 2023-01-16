package string;

public class string_char {
	
	public static void main(String[] args) {
		String s = "Velocity";
		
	int size =s.length();
	System.out.println(size);

      for(int i = 1; i<=size;i++)
      {
    	  char a= s.charAt(i-1);
    	  System.out.println(a);
      }
		
	}

}
