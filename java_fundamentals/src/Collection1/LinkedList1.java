package Collection1;

import java.util.*;

public class LinkedList1 {
 public static void main(String[]args) {
    	 
    	 LinkedList<String> al = new LinkedList<>();
    	 
    	 al.add("January");
    	 al.add("February");
    	 al.add("March");
    	 al.add("April");
    	 al.add("May");
    	 al.add("June");
    	 al.add("July");
    	 al.add("August");
    	 al.add("September");
    	 al.add("October");
    	 al.add("November");
    	 al.add("December");
    	 System.out.println(al);
    	 for(String month : al) {
    	 System.out.println(month);
    	 }
 }
    	 
}
