package corejava;

import java.io.*;  
 class FilterInputStreamExample{  
	 //Main driver method
    public static void main(String[] args) throws IOException {  
        File data = new File("C:\\my file\\testout.txt");  
        //creating file for class
        FileInputStream  file = new FileInputStream(data);  
        //creating object for class
        FilterInputStream filter = new BufferedInputStream(file);  
        int k =0;  
        while((k=filter.read())!=-1){ 
        	//printing the output
            System.out.print((char)k);  
        }  
        file.close();  
        filter.close();  
    }  
}  

