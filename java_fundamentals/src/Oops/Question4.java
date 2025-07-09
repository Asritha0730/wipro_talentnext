package Oops;

import java.util.Scanner;

public class Question4 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string :");
		String str = sc.nextLine();
		
		StringBuffer result = new StringBuffer();
		
		if(str.length() % 2 == 0) {
			int str2 = str.length()/ 2;
			result.append(str.substring(0,str2));
			System.out.println("Result :"+result);
		}
		else {
			System.out.println("Result : null");
		}
		
		
	}
}
