package constructor;

public class college {
	String StudentName;
	
	static String college = "coep";
	
	int mathmarks;
	
	String city;
	
	public  college(String sname,int mmarks,String scity)
	{    StudentName = sname;
	     mathmarks = mmarks ;
	     city = scity;
		
	}
	
	public static void main(String[] args) {
		college c = new college("Jaykumar",20,"Pune");
		System.out.println(c.StudentName);
		System.out.print(c.mathmarks);
		System.out.println(c.city);
		
		
		
		
	}
	
	
	
	

}
