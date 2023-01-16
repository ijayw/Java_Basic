
package String_Gaurav_Sir;

public class add_of_intergers {

public static void main(String[] args) {
		 
   String s = "ajbn5666kank626";
		 
    int sum = 0;
		 
     for (int i = 0; i < s.length(); i++) 
		  { 
    	 
		 if (Character.isDigit(s.charAt(i))) 
			 
		   {
		 
     sum = sum + Integer.parseInt(String.valueOf(s.charAt(i)));
		 
		   }
		 
		   }
		 
	 System.out.println("addition of the integers available in the string is: " + sum);
		 
		  }
		 
		  }
 

