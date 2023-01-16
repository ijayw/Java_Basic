package polymorphism;

public class Overloading_V {

public int sum(int x, int y) 
{
	return x + y ;
}

public int sum(int x, int y,int z) 
{
	return x + y + z ;
}

public double sum(double x, double y) 
{
	return x + y ;
}
public static void main(String[] args) {
	Overloading_V o = new Overloading_V();
System.out.println(o.sum(153669, 632156));
System.out.println(o.sum(12563, 636, 6256));
System.out.println(o.sum(1523.62, 26.56));

}

}
