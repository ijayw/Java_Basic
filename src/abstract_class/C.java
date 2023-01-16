package abstract_class;

public class C extends B {

	 
	public void Delete_profile() 
	{
System.out.println("delete Profile Fuctionality from C Class"); 
		
	}

	public static void main(String[] args) {
		C c = new C();	
		c.Add_Personal_info();
		c.Add_view_Profile();
		c.Add_image();
		c.Delete_profile();
		
	}
}
