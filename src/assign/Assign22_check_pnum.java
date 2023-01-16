package assign;

 public class Assign22_check_pnum {	
 public static void p(int num) {
	int n = num,temp=0;
	for(int i=2;i<=n-1;i++)
	{
		     if(n%i==0)
		     {
		    	 temp=temp+1;
		     }
	}
	if(temp>0)
	{
		System.out.println(n+"! not prime number");
	}
	else
	{
		System.out.println(n+" = prime number ");	
	}		
  }

 public static void main(String[] args) {
p(1);p(2);p(3);p(4);p(5);p(6);p(7);p(8);p(9);p(10);p(11);
p(12);p(13);p(14);p(15);p(16);p(17);p(18);p(19);p(20);p(21);p(22);
p(23);p(24);p(25);		
 }
 }
