//java program to create new file with exception handling
package corejava;

import java.io.File;

 class CreateNewFile {

	public static void main(String[] args)  {
		
        try {
        	//create the object
        	File file= new File("C:\\my file\\shubham22.txt");
        	//calling the method using if loop
        	if(file.createNewFile()) {
        		//print
        		System.out.println("Success");
        	}
        	else {
        		//print
        		System.out.println("Not success");
        	}
        }catch(Exception e) {
        	System.out.println(e);
        }
        }
	}
