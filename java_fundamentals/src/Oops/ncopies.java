package Oops;

import java.util.Scanner;

public class ncopies {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string:");
		String str1 = sc.nextLine();
		String firstTwo;
		if(str1.length()>=2) {
			 firstTwo = str1.substring(0, 2);
		}else {
			 firstTwo = str1;
		}
		
		StringBuffer sb = new StringBuffer();
		
		for(int i =0;i<str1.length();i++) {
			sb.append(firstTwo);
			
		}
		System.out.println("Result :"+sb.toString());
	}
}
