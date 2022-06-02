//java program to demonstrate BufferedinputStream
 
	package corejava;
	import java.io.*; 

	import java.io.BufferedInputStream;

	 class BufferedInputStrem{  
		 //Main driver method
	    public static void main(String[] args) throws IOException {  
	        FileInputStream data = new FileInputStream("C:\\BufferedExample.txt");  
	        //creating file for class
	        BufferedInputStream  file = new BufferedInputStream(data);  
	        //creating object for class
	        BufferedInputStream Buffer = new BufferedInputStream(file);  
	        int k =0;  
	        while((k=Buffer.read())!=-1){ 
	        	//printing the Character output
	            System.out.print((char)k);  
	        }  
	        file.close();  
	        Buffer.close();  
	    }  
	}  




