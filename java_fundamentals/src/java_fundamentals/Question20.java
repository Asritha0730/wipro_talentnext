package java_fundamentals;

import java.util.Scanner;

public class Question20 {
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);

      System.out.print("Enter number: ");
       int num = sc.nextInt();
       int num2 = num;
       int reversed = 0;
       while(num!=0) {
    	   int digit = num % 10;
    	   reversed = reversed*10 + digit;
    	   num = num / 10;
       }
       if (num2 == reversed) {
           System.out.println(num2 + " is a palindrome number.");
       } else {
           System.out.println(num2+ " is not a palindrome number.");
       }

	}
	
}
