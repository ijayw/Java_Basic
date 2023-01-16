package loop;
public class ReverseNo {
	public void reva(int num)
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
		System.out.println("♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛");
	}
	else
	{
		System.out.println("Its not Numeral Palindrome");
		System.out.println("●▬▬▬▬๑۩۩๑▬▬▬▬▬●");
	}
	System.out.println("");
	}
     public static void main(String[] args) {
    	 ReverseNo r = new ReverseNo();
    	 r.reva(01210);
    	 r.reva(12345);
    	 r.reva(191919);
    	r.reva(12321);
}
}
