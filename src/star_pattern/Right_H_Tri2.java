package star_pattern;

public class Right_H_Tri2 {
public static void main(String[] args) {
       for(int i=1; i<=4 ;i++)
			{
				for(int j=1; j<=4 ;j++)
				{
					if(j>=1 && j<=i)
					{
						System.out.print("*");
					}
					System.out.print("");
				}
			
				System.out.println();
			}
       for(int i=1; i<=4 ;i++)
		{
			for(int j=1; j<=4 ;j++)
			{
				if(j>=1 && j<=4-i)
				{
					System.out.print("*");
				}
				System.out.print("");
			}
		
			System.out.println();
		}
		}

	    }
	


