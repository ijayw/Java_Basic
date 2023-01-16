package collectiondiscussion;

import java.util.TreeSet;

public class TreeSetDisc {
	public static void main(String[] args) {
		
		TreeSet<String> ts =  new TreeSet<String> ();
		
		ts.add("pune");
		
		ts.add("Mumbai");
		
		ts.add("Delhi");
		
		ts.add("Delhi");
		
		ts.add("Kolkata");
		
		ts.add("Delhi");
		
		System.out.println(ts);
		
		TreeSet<Integer> ts1 =  new TreeSet<Integer>(new MyComp());
		
		ts1.add(50);
		
		ts1.add(100);
		
		ts1.add(15);
		
		ts1.add(20);
		
		ts1.add(50);
		
		
		ts1.add(15);
	
		
		System.out.println(ts1);
		
	}

}
