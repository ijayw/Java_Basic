package string_discussion;
public class StringS {
   public static void main(String[] args) {
	   String s = "    this    is   the String";
	   char temp= ' ';
	   String f_String ="";	
	   for(int i=0; i<=s.length()-1;i++)
	   {
		   char c = s.charAt(i);
		   if(temp==c)
		   {
			   continue;
		   }
		   else 
		   {
			  f_String = f_String + c;
			  temp = c;
		   } 
	   }
	   System.out.println(f_String);
	
      }
	
   }
