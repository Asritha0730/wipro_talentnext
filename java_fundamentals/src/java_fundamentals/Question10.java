package java_fundamentals;

import java.util.Scanner;

public class Question10 {

public static void main(String[]args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.print("Enter the character :");
	   char ch = sc.next().charAt(0);
       
       if (Character.isLowerCase(ch)) {
           System.out.println( Character.toUpperCase(ch));
       } else if (Character.isUpperCase(ch)) {
           System.out.println( Character.toLowerCase(ch));
       } else {
           System.out.println("Not alphabet letter.");
       }
	   
	   
   }
}
