package Oops;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the num :");
		int num = sc.nextInt();
		
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		
		StringBuffer reverse = new StringBuffer(sb).reverse();
		
		if(sb.toString().equals(reverse.toString())) {
			 System.out.println(num + " is a Palindrome.");
		}
		else {
			 System.out.println(num + " is not a Palindrome.");
		}
		sc.close();
	}
	
	

}
