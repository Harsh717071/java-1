package corejava;
import java.io.*;
import java.io.InputStreamReader;
public class BufferedReaderExample{
	//Main driver method
	public static void main(String args[])throws Exception{ 
		//creating object of class
		InputStreamReader r=new InputStreamReader(System.in);
		//creating scanner class
		BufferedReader br=new BufferedReader(r);
		//print the output
		System.out.println("Enter your name"); 
		String name=br.readLine();
		
		System.out.println("Welcome "+name); 
		} 
	}
