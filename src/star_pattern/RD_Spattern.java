package star_pattern;

public class RD_Spattern {
	
	public static void main(String[] args) {
		for(int i =1; i<=4;i++)
		{
			for(int j =1;j<=7;j++)
			{
				if(j>=5-i && j<=3+i)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
