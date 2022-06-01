package corejava;

import java.io.FileOutputStream;
//main class
public class FileOutputstream {
//main method
	public static void main(String args[]){
		//creating return statements try and catch
		try{
			//create object class
			FileOutputStream fout=new FileOutputStream("C:\\my file\\myfil.txt"); 
			fout.write(65);
			fout.close(); 
			System.out.println("success..."); 
			}
		catch(Exception e){
			//printing the output
			System.out.println(e);
			}
		}

}
