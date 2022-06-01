package corejava;

	import java.io.*;    
	public class DataInputStreamExample { 
		//Main driver method
	  public static void main(String[] args) throws IOException {  
		  //creating object of class
	    InputStream input = new FileInputStream("C:\\my file\\testin.txt");  
	    //creating file for class
	    DataInputStream inst = new DataInputStream(input);  
	    //creating variable integer
	    int count = input.available();  
	    byte[] ary = new byte[count];  
	    inst.read(ary);  
	    for (byte bt : ary) {  
	      char k = (char) bt;  
	      //print the output
	      System.out.print(k+"-");  
	    }  
	  }  
	}  


