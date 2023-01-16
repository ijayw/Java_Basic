  package String_Gaurav_Sir;

  public class Remove_replace_num {
// 7. WAP to remove the duplicate character from String and 
//	represent the character count next to 
//	it e.g. abcdefabcdef--- expected output a2b2c2d2e2f2
  public static void main(String[] args) {
		
	    String input = "abcdefabcdef";
        String output = "";
 
     for (int i = 0; i < input.length(); i++) {
 
         int count = 1;
         char c = input.charAt(i);
 
      for (int j = i + 1; j < input.length(); j++)
              {
 
                if (c == input.charAt(j))
                 {
                    count = count +1;
                 } 
 
              }
 
            output = output + c + count;
 
      }
 
        System.out.println(output);
 
       }	

    }
	
	
	
	
	


