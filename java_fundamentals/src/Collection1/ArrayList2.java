package Collection1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList2 {
	
	ArrayList<String> al = new ArrayList<>();
	  public static void  printAll(ArrayList<String> al){
		  Iterator<String> iterator = al.iterator();
	        System.out.println("Elements in the ArrayList:");
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
		  
	  }
	  
	
	
           public static void main(String[]args) {
        	   
        	   ArrayList<String> al = new ArrayList<>();
        	   
        	 al.add("January");
        	 al.add("February");
        	 al.add("March");
        	 al.add("April");
        	 printAll(al);
        	 
        		   
        		   
        	   
        	   
        	   
           }

	
}
