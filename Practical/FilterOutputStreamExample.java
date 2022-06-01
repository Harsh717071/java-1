package corejava;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

public class FilterOutputStreamExample {
	 // main driver method
	    public static void main(String[] args) throws IOException {  
	        File data = new File("C:\\my file\\myfile.txt");  
	        //create a file for class
	        FileOutputStream file = new FileOutputStream(data);  
	        //creating object for class
	        FilterOutputStream filter = new FilterOutputStream(file);  
	        //creating string variable 
	        String s="Welcome to Mumbai.";      
	        byte b[]=s.getBytes();      
	        filter.write(b);     
	        filter.flush();  
	        filter.close();  
	        file.close();  
	        //print the output
	        System.out.println("Success...");  
	    }  
	


}
