package constructor;

public class Student_data {
	 int id;
	 String name;
	 int age;
	

	 Student_data(int i,String n,int a ) 
	 {  id =i;
	     name=n;
	    age=a;
	   
	 }
public static void main(String[] args) {
	Student_data s1 = new Student_data(101,"Mahendra" , 20);
	System.out.print(s1.id);
	System.out.print(")");
	System.out.print(s1.name);
	System.out.print(" Age");
	System.out.print(s1.age);
	
	
	
}
}
