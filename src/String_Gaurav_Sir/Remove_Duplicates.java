package String_Gaurav_Sir;

public class Remove_Duplicates {
//	6. WAP to remove duplicate characters from String:
	public static void main(String[] args) {
		
	String input = "aaamodddkkkpppjoijiov";
	String output ="";
	for(int i=0;i<input.length();i++)
	{
		if(!output.contains(String.valueOf(input.charAt(i)))) 
		{
			output+= String.valueOf(input.charAt(i));
		}

	}
		
	System.out.println(output);	

	}
 
   }
         