package collectiondiscussion;

import java.util.ArrayList;

public class Assignment {
///	*WAP to add the value of Hyderabad only 
//	if collection has Bengaluru in it using normal for loop.
	public static void main(String[] args) {
		
		ArrayList<String> ar = new ArrayList<String>();
		
		ar.add("Mumbai");
		
		ar.add("Delhi");
		
		ar.add("Kolkatta");
				
		ar.add("Bengaluru");
		
		
		for(int i=0;i<ar.size();i++)
			
		{
			if(ar.get(i).contains("Bengaluru"))
			{
				ar.add("Hyderabad");
	
			}
			
		}
		System.out.println(ar);
	    }

       }
