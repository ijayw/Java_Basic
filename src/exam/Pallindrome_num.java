package exam;

public class Pallindrome_num {
   public static void main(String[] args) {
	    
	       int ori_num =12221;
	       int num= ori_num;
	       int rev =0;
	       while(num!=0)
	       {
	    	  int remainder=num%10;
	    	  rev = (rev*10)+remainder;
	    	  num = num/10;
	       }
	       System.out.println(rev);
	       
	       if(rev==ori_num)
	       {
	    	   System.out.println(ori_num+" is palindrome number");
	       }
	       else
	       {
	    	   System.out.println(ori_num+"not palindrome");
	       }

	   
}
	

}
