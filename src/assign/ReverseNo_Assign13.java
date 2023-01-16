package assign;
public class ReverseNo_Assign13 {
	public static void reva(int num)
	{int number= num;
	int rev=0,remainder=0,quot=0;
	while(num>0)
	{  remainder = num%10;
	   rev= (rev*10)+remainder;
	   quot=num/10;
	   num=quot;
	}
	System.out.println("original number is "+number);
	System.out.println("reverse number="+rev);
	
	
	if(number==rev)
	{
		System.out.println("Its Numeral Palindrome");
	}
	else
	{
		System.out.println("Its not Numeral Palindrome");
	}
	System.out.println("───▄▄▄\r\n"
			+ "─▄▀░▄░▀▄\r\n"
			+ "─█░█▄▀░█\r\n"
			+ "─█░▀▄▄▀█▄█▄▀\r\n"
			+ "▄▄█▄▄▄▄███▀\r\n"
			+ "");
	}
     public static void main(String[] args) {
    	 reva(12321);

}
}
