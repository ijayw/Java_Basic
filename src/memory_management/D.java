package memory_management;
public class D extends E {
	public void m10() 
	{	
		a.m2();
		b.m6();
		c.m9();
	}
	
    public void m11() 
    {
    	a.m1();
    	c.m7();
    	b.m4();	
	}
    public static void main(String[] args) {
     D d = new D();
     d.m10();
     d.m11();  		
	}
}
