package WrapperClasses;

import java.util.Scanner;

public class WrapperClass4 {
      public static void main(String[]args) {
    	  Scanner sc = new Scanner(System.in);
    	  
    	  System.out.println("enter the value :");
    	  int i = sc.nextInt();
    	  
    	  if(i<1 || i>255) {
    		  System.out.println("Invalid input");
    		  return;
    	  }
    	  
    	  String bs = Integer.toBinaryString(i);
    	  String format = String.format("%8s", bs).replace(' ','0');
    	  System.out.println("Binary 8-bit :"+format);
      }
}
