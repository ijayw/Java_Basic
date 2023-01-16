       package variable;

    public class IfElse03 {
	
	public static void main(String[] args) {
		int A = 10;
		int B = 20;
		int C = 5;
		if(A<B)// if second number is greater than 5
		{
			System.out.println(B + " Greater "+ " than "+C +"  i.e " + "(20>5)" +"  True  Statement "   );// True Statement	
		}
		else
		{
			System.out.println( B + " Less "+ " than "+C +"  i.e " + "20<5" );
		}
		
		if(A<B)// if first number is greater than second
		{
			System.out.println(A + " Greater "+ " than "+B +"  i.e " + "(10>20)" + " False Statement " );// false Statement
		}
		}
	}
