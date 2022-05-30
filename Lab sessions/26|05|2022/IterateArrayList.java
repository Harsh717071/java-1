//java program to create ArrayList
package corejava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

 class IterateArrayList{
 public static void main(String[]args) {
	 //creating the scanner object
	 Scanner sc = new Scanner(System.in);
	 System.out.println("enter the First Number");
	 String a =sc.next();
	 //taking input from user 
	 System.out.println("enter the Second Number ");
	 String b =sc.next();
	//taking input from user 
	 System.out.println("enter the third Number ");
	 String c =sc.next();
	//taking input from user 
	 System.out.println("enter the fourth Number");
	 String d =sc.next();
	//taking input from user 
	 
	 
	 
	 //creating the object 
	 ArrayList<String> li = new ArrayList<String>();
	 
	 li.add(a);
	 li.add(b);
	 li.add(c);
	 li.add(d);
	 
	//method of iterating the element ArrayList
	 Iterator<String> irs =  li.iterator();
	 System.out.println("");
	 System.out.println("list of Number ");
	
	 
	 while(irs.hasNext()) {
		
		 //printing the list
		 System.out.println(irs.next());
	 }
 }
}
