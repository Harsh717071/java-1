package corejava;


	import java.io.*;  
	public class OutputExample {  
	    public static void main(String[] args) throws IOException {  
	    	//Creating a object class 
	        FileOutputStream file = new FileOutputStream("C:\\my file\\myfile.txt");  
	        DataOutputStream data = new DataOutputStream(file);  
	        data.writeInt(65);  
	        data.flush();  
	        data.close();  
	        //Print the value
	        System.out.println("Succcess...");  
	    }  
	}  


