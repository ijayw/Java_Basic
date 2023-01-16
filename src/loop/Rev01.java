package loop;

public class Rev01 {
	public static void main(String[] args) {
		int num=12345,rev=0;
		while (num!=00)
			{
			int remainder=num%10;
			rev= rev*10+remainder;
			num=num/10;
			}
		System.out.println(rev);
	}

}
