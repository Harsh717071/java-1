package corejava;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

 class BufferOutStream {
	public static void main(String args[])throws Exception{
		//create the object for FileOutputStream
		FileOutputStream fout=new FileOutputStream("C:\\my file\\myfile.txt"); 
		//create the object for BufferedOutputStream
		BufferedOutputStream bout=new BufferedOutputStream(fout);
		//initialize the variable
		String s="Welcome to Lecture."; 
		//creating newly array byte
		byte b[]=s.getBytes(); 
		bout.write(b); 
		bout.flush(); 
		bout.close();
		fout.close();
		//print the output
		System.out.println("success"); }

}
