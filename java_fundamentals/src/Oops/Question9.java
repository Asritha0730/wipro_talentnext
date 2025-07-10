package Oops;

import java.util.Scanner;

public class Question9 {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter first string a: ");
	        String a = sc.nextLine();

	        System.out.print("Enter second string b: ");
	        String b = sc.nextLine();
	        
	        StringBuilder res = new StringBuilder();
	        

	        int maxLength = Math.max(a.length(), b.length());
	        for(int i =0;i < maxLength;i++) {
	        	if(i < a.length()) {
	        		res.append(a.charAt(i));
	        	}
	        	if (i < b.length()) {
	                res.append(b.charAt(i));
	            }
	        }
	        System.out.println("Output: " + res.toString());
	        
	  }
}
