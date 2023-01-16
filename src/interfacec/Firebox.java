package interfacec;

import interface_discussion.Browser;

public class Firebox implements Browser {

	 
	public void openbrowser() {
		System.out.println("open browser from firebox ");
	}

	
	public void close() {
		System.out.println("close browser from firebox");
	}

	public void new_tab() {
	System.out.println("new tab from firebox ");
	}


	public void refresh() {
		System.out.println("refresh from firebox");
		
	}
	
	public void Private_tab() {
		System.out.println("Private_tab from firebox");
		
	}
	
	public static void main(String[] args) {
		
		Firebox c = new Firebox();
		c.openbrowser();
		c.close();
		c.new_tab();
		c.refresh();
		c.Private_tab();
		
	
	}
	

}
