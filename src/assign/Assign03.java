package assign;

public class Assign03 {

	public void Add() {
		
		int s1= 486;
		int s2= 654;
		int s3 =s1+ s2 ;
		System.out.println("addition of    " +s1+ "   and    " + s2 + "   is   " + s3);
		}
	
	public void sub() {
		
		int s1= 486;
		int s2= 654;
		int s3 =s1- s2 ;
		System.out.println("diff of    " +s1+ "   and    " + s2 + "   is   " + s3);
		}
	
	public void multi() {
		
		int s1= 486;
		int s2= 654;
		int s3 =s1* s2 ;
		System.out.println("multi of    " +s1+ "   and    " + s2 + "   is   " + s3);
		}
	
	public void div() {
		
		float s1= 486f;
		 float s2 = 654f;
		 float s3 = s1/ s2 ;
		System.out.println("divn of    " +s1+ "   and    " + s2 + "   is   " + s3);
		}
	
	public static void main(String[] args) {
		
		Assign03 var = new Assign03();
		var.Add();
		var.sub();
		var.multi();
		var.div();
		}
	
	 }
