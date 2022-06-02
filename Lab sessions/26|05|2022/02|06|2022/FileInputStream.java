//java program to demonstrate on FileInputStream

package corejava;
import java.io.*;  
 class FileInputStreamExample{  
	 //Main driver method
    public static void main(String[] args) throws IOException {  
        File data = new File("C:\\my file\\myfile.txt");  
        //creating file for class
        FileInputStream  file = new FileInputStream(data);  
        //creating object 
        FilterInputStream filter = new BufferedInputStream(file);  
        int k =0; 
        //calling read method() using while loop
        while((k=filter.read())!=-1){ 
        	//printing the output
            System.out.print((char)k);  
        }  
        file.close();  
        filter.close();  
    }  
}  


