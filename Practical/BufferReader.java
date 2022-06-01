package corejava;
	import java.io.BufferedReader;
	import java.io.FileReader; 
	public class BufferReader {
		//Main driver method
		public static void main(String [] args) throws Exception {
			//creating object of class
			FileReader file = new FileReader("C:\\my file\\myfile.txt"); 
			//creating file for class
			BufferedReader br = new BufferedReader(file);
			//Initialize variable 
			int i ;
			while((i=br.read())!= -1){ 
				// print the output
				System.out.print((char)i); 
				}
			br.close();
			file.close(); 
			} 
		}


