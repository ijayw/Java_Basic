package constructor;

public class Employee_Info {
	String name;
	String email_id;
	int mobile_no;
	String date_of_birth;
	
	
public  Employee_Info(String n,String id,int m_no,String dob)
	{
		        name         = n;
				email_id     = id;	
				mobile_no    = m_no;
				date_of_birth= dob;
	}
	
public static void main(String[] args) {
	Employee_Info e = new Employee_Info
("karan","karan@gmail.com",999999999,"25th june 2002 ");
	System.out.println(e.name);
	System.out.println(e.email_id);
	System.out.println(e.mobile_no);
	System.out.println(e.date_of_birth);
		
}
	
}
