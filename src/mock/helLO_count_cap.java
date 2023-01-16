package mock;

public class helLO_count_cap {
	
	public static void main(String[] args) {
		String str = "HelLO";
		count(str);
	}

	private static void count(String str) {
		
		char [] ch = str.toCharArray();
		int cap = 0;
		for(int i =0;i<str.length();i++)
		{
			if (Character.isUpperCase(ch[i]))
			{
				cap++;
				
			}
	
		}
		System.out.println("cap letter ");
		System.out.println(cap);

	}

   }
