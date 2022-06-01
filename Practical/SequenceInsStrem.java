package corejava;
import java.io.FileInputStream;
import java.io.SequenceInputStream;
public class SequenceInsStrem
{
public static void main(String args[]){
	try{ FileInputStream fin=new FileInputStream("C:\\my file\\myfile.txt");
	int i=0;
	while((i=fin.read())!=-1){ 
		System.out.print((char)i);
		} fin.close();
		}catch
	(Exception e){
			System.out.println(e);
		}
}
}

