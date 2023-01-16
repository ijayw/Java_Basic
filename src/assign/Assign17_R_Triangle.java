package assign;

public class Assign17_R_Triangle 
{

	public static void main(String[] args)
	{
		
		int r=5;
		for(int i=1; i<=5; i++) 
		{
	       for(int j=1; j<=5; j++) 
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
