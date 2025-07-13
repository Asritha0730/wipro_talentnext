package ExceptionHandling;

import java.util.Scanner;

public class MathOperation {
         public static void main(String[]args) {
        	 try {
        		 if(args.length !=5) {
        			 System.out.println(" Enter correctly");
        			 return;
        			
        		}
        		 int [] arr=new int[5];
        		 int sum =0;
        		 for(int i =0;i<5;i++) {
        			 arr[i]=Integer.parseInt(args[i]);
        			 sum = sum+arr[i];
        		 }
        		 int avg = sum/arr.length;
                 System.out.println("Sum of array elements: " + sum);
                 System.out.println("Average of array elements: " + avg);
        		
        		 
        	}catch(ArithmeticException e) {
        		 System.out.println("java.lang.ArithmeticException");
        	 }
         }
}
