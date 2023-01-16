package loop;

public class Pallindrome_num {
	public static void main(String[] args) {
//		wrong
		int num = 12345,reverse=0;
		while (num!=0)
		{
			int remainder= num%10;
			reverse= reverse*10+remainder;
			num=num/10;
			
		}
		System.out.println(reverse);
       
		if(num==reverse)
		{
			System.out.println("this num is pallindrome");
		}
		else
		{
			System.out.println("this not a pallindrome number");
		}
		
		
	}

}
