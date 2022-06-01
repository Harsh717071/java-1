package corejava;
import java.io.*;  
public class DataStreamExample {  
public static void main(String args[])throws Exception{    
	//creating object of class
      FileOutputStream fout1=new FileOutputStream("C:\\my file\\myfile.txt");    
      FileOutputStream fout2=new FileOutputStream("C:\\my file\\copyofmyfile.txt");    
        // creating object of class
      ByteArrayOutputStream bout=new ByteArrayOutputStream();  
      //creating writer() method
     bout.write(65);    
      bout.writeTo(fout1);    
      bout.writeTo(fout2);    
      bout.flush();    
      bout.close();//has no effect    
      //printing the value
      System.out.println("Success...");    
     }    
    }  
