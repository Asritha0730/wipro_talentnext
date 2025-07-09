package Oops;

import java.util.Scanner;

public class Question7 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  string :");
		String a = sc.nextLine();
		
		String result;
		
	    if(a.length() >= 1 && a.charAt(0)=='x') {
	    	a = a.substring(1);
	    }
		if(a.length()>=1 && a.charAt(a.length()-1) == 'x') {
			a = a.substring(0, a.length()-1);
		}
		System.out.println("Result: " + a);
		
	}
}
