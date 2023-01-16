package star_pattern;

public class L1Triagle {
	
	public static void main(String[] args) {
		int x=5;
		for(int i=1; i<=5;i++)
		       {
			for(int j=1; j<=5; j++) {
				if(j>=1 && j<=(x-1)) {
					System.out.print("");
				}
				else {
					System.out.print("*");
				}
				
			}
			System.out.println();
		}
		
		
		
	}
	
}
