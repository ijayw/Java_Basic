package stringdiscussion;

public class Last_Index_Position {

	public static void main(String[] args) {
		String s1 = "Velocity";
        int last_index=s1.length()-1;
        
        for(int i= 0;i<=last_index;i++)
        {
        char charvalue = s1.charAt(i);	
        System.out.println(charvalue);
        }
       
	}

}
