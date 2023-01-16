package star_pattern;

public class L_Triangle {
	public static void main(String[] args) {
		int c=5;
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print("*");
			}
			for(int j=1;j<=c-i;j++)
			{
				System.out.print("");
			}
			System.out.println();
	}
		
	}

    }
