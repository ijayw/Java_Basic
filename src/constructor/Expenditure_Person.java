package constructor;
public class Expenditure_Person {
	int rent ;
	int food  ;
	int education ;

	Expenditure_Person(int r,int f, int ed){
		 rent      =r ;
	     food      =f ;
		 education =ed;
		
}
	public static void main(String[] args) {
		 Expenditure_Person e1 = new Expenditure_Person(10,20, 30);
		 System.out.println("expenditure list all person as follows :- ");
		 System.out.print(" rohan having expenses of");
		 System.out.print(" rent "+e1.rent+"₹");
		 System.out.print(" food "+e1.food+"₹");
		 System.out.print(" education "+e1.education+"₹");
		 
	}

}
