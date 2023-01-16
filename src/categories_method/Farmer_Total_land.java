package categories_method;
// the farmer has 3 land having different area calculate total area
public class Farmer_Total_land {
	
	public int A1(int lenght, int width)
	{   int Area = lenght*width;
	return Area;
    }
	
    public static void main(String[] args) {
	Farmer_Total_land A = new Farmer_Total_land();
	int a = A.A1(9, 6);
	int b = A.A1(6, 5);
	int c = A.A1(10, 8);
	int d = a+b+c;
	System.out.println("Yubari Melon      Area=  " +a+ "  Acres" );
	System.out.println("                            +");
	System.out.println("Dragon Fruit      Area=  " +b+ "  Acres" );
	System.out.println("                            +");
	System.out.println("StarFriut         Area=  " +c+ "  Acres" );
	System.out.println("                            +");
	System.out.println("Total Farmer Land Area=  " +d+"  Acres" );
}
}
