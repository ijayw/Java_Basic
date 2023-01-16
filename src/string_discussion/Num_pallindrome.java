package string_discussion;

public class Num_pallindrome {

	public static void main(String[] args) {
		int num = 1221;
		int rev = 0;
		int orinum =num;
		while(num!=0)
		{
			
			int a = num%10;
			rev = rev*10+a;
			num=num/10;
			
		}
		
		if(rev==orinum)
		{
			System.out.println("This is Pallindrome number");
		}
		else
		{
			System.out.println("This is NOT Pallindrome number");
		}
	}

    }
