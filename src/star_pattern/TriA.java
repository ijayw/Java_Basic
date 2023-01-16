package star_pattern;

public class TriA 
{

	public static void main(String[] args)
	{
		
		int r=5;
		for(int i=1; i<=r; i++) 
		{
	       for(int j=1; j<=r; j++) 
	       {
		       if(j>=1 && j<=r-i) 
		         {
		           System.out.print(" ");
	              }
		       else 
		         {
		    	   System.out.print("*");
		          }
	       }
	       System.out.println();
		}
	}
}
