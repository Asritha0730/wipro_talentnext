package Oops;
import java.util.Scanner;
public class Person {
	Scanner sc = new Scanner(System.in);
     String name;
     public Person() {
    	 
     }
     public Person(String name) {
    	 this.name = name;
     }
     public String getName() { 
		  return name;
		  }
     public void setName(String name) {
	    	this.name = name;
	    	
	    }
}
