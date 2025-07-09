package Oops;

import java.util.Scanner;

public class Question5 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string :");
		String str = sc.nextLine();
		
		StringBuffer result = new StringBuffer(str);
		
		if(str.length()>2){
			result.deleteCharAt(str.length()-1);
			result.deleteCharAt(0);
			System.out.println("Result :"+result.toString());
			
		}else {
			System.out.println("Result ");
		}
		
		
		
	}
}
