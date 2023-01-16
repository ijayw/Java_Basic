package assign;

public class Assign07_Farmer_Total_land {
	
	public int A1(int a, int b)
	{   int c = a*b;
	
	return c;
    }
	public int A2(int a, int b)
	{   int c = a*b;

	return c;
    }
	public int A3(int a, int b)
	{   int c = a*b;
	
	return c;
    }
public static void main(String[] args) {
	Assign07_Farmer_Total_land A = new Assign07_Farmer_Total_land();
	int a = A.A1(78, 95);
	int b = A.A2(63, 25);
	int c = A.A3(45, 95);
	int d = a+b+c;
	System.out.println("Yubari Melon      Area=  " +a+ "  Acres" );
	System.out.println("                    +");
	System.out.println("Dragon Fruit      Area=  " +b+ "  Acres" );
	System.out.println("                    +");
	System.out.println("StarFriut         Area=  " +c+ "  Acres" );
	System.out.println("                    +");
	System.out.println("Total Farmer Land Area=  " +d+"  Acres" );
}
}
