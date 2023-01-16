package assign;

public class Assign23_Count_Letter {

	public static void main(String[] args) {
		
		
		String s = "Philadelphia";
		int size = s.length()-1;
		int count = 0;
		for(int i =0; i<=size; i++)
		{
			char c = s.charAt(i);
			if(c=='a')
			{
				count++;
			}
			
			
			
		}
		
		System.out.println(count);		

	}

}
