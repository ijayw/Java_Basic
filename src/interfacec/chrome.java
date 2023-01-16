package interfacec;

import interface_discussion.Browser;

public class chrome implements Browser {

	 
	public void openbrowser() {
		System.out.println("open browser from chrome ");
	}

	
	public void close() {
		System.out.println("close browser from chrome");
	}

	public void new_tab() {
	System.out.println("new tab from chrome ");
	}


	public void refresh() {
		System.out.println("refresh from chrome");
		
	}
	
	public void incognito() {
		System.out.println("incognito from chrome");
		
	}
	
	public static void main(String[] args) {
		
		chrome c = new chrome();
		c.openbrowser();
		c.close();
		c.new_tab();
		c.refresh();
		c.incognito();
		
	
	}
	

}
