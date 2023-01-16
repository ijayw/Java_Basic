package encapsulation;

public class Bank_Server {
private double cumstomer=50000;

public void getbalance(int pin) {
	if (pin==1234)
	{
		System.out.println("your balace is "+ cumstomer);
	}
	else
	{
		System.out.println("invalid pin please try again");
	}
	
}

public void setbalance(int amount) {
	if (amount <= cumstomer)
	{
		cumstomer=cumstomer - amount;
		System.out.println("please collect the cash");
	}
	else
	{
		System.out.println("insuffcient balance");
	}
}

}
