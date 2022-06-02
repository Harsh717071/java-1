//java program to demonstrate on FileoutputStream

package corejava;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

 class FileOutputStream2 {
	 // main driver method
	    public static void main(String[] args) throws IOException {  
	        File data = new File("C:\\my file\\myfile.txt");  
	        //create a file for class
	        FileOutputStream file = new FileOutputStream(data);  
	        //creating object as FilterOutputStream
	        FilterOutputStream filter = new FilterOutputStream(file);  
	        // initialize the string value
	        String s="Welcome to Anudeep Foundation.";      
	        byte b[]=s.getBytes();      
	        //calling the method
	        filter.write(b);     
	        filter.flush();  
	        filter.close();  
	        file.close();  
	        //print the output
	        System.out.println("Success...");  
	    }  
	


}

