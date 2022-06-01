package corejava;
import java.io.FileInputStream;
import java.io.SequenceInputStream;
public class SequenceInsStrem
{
	//main driver method
public static void main(String args[]){
	//creating return statements try and catch
	try{ FileInputStream fin=new FileInputStream("C:\\my file\\myfile.txt");
	//initialize variable integer
	int i=0;
	while((i=fin.read())!=-1){ 
		//printing the output
		System.out.print((char)i);
		} fin.close();
		}catch
	(Exception e){
			System.out.println(e);
		}
}
}

