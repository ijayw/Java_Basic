package exception_discussion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileNOTFound {

public static void main(String[] args) {
	   
	  String filepath = "\"D:\\Velocity Software Testing Course\\Assignments\\New folder\\Bucket & Ball.docx\"";
	 
	try
	  {
		FileInputStream fis = new FileInputStream(filepath);
		System.out.println("lst line of block");
	  }
	catch(FileNotFoundException e )
	  {
		System.out.println("file is not found exception arrive");
	  }

}
	
	
}
