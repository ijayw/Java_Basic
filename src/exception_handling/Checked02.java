package exception_handling;

public class Checked02 {

public static void main(String[] args) {
	
	   System.out.println("First line");
	   
	   try 
	   {
		   Thread.sleep(3000);
	   }
	   catch (InterruptedException e) 
	   {
		  System.out.println("this is interrupted exception"); 
	
	 }
	
	   System.out.println("last line");

}

}
