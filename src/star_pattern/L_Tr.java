package star_pattern;

public class L_Tr {
	public void star(int row) {
        int r = row;
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
		    	   System.out.print("*" );  
		          }
	       }
	       System.out.println();    
		}
		if (r==row)
		{
			System.out.println(r +" Star Triangle ");
			System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		}
		
		}
    public static void main(String[] args) {
    	L_Tr t = new L_Tr();
    	t.star(5);
    	t.star(10); 
    	t.star(15);
    	t.star(20);
    
}
}
