package Oops;

import java.util.Scanner;

public class Question6 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  string :");
		String a = sc.nextLine();
		System.out.println("Enter  string :");
		String b = sc.nextLine();
		String result;
		
		if(a.length() < b.length()) {
			result = a + b+ a;
		}else {
			result = b+a+b;
		}
		System.out.println("Result :"+result);
		
	}
		
}
