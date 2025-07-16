package Collection1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class HashSet2 {
	public static void main(String[]args) {
   
	HashSet<String> emp = new HashSet<>();
	emp.add("Marrie");
	emp.add("john");
	emp.add("Krish");
	emp.add("Marrie");
	
	Iterator<String> it = emp.iterator();
	while(it.hasNext()) {
		String employee = it.next();
		System.out.println(employee);
		
	}
	
	
	
	}
	
}
