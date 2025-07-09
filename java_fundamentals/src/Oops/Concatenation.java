package Oops;

import java.util.Scanner;

public class Concatenation {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first string: ");
		String str1 = sc.nextLine().trim();
		System.out.print("Enter second string: ");
		String str2 = sc.nextLine().trim();
		//lowercase conversion
		String lowerstr2 = str2.toLowerCase();
		
		StringBuffer result = new StringBuffer(str1);
		
		if(!str1.isEmpty()&&!str2.isEmpty()) {
			char lastchar = str1.charAt(str1.length()-1);
			char firstchar = lowerstr2.charAt(0);
			if(Character.toLowerCase(lastchar) == firstchar) {
				lowerstr2 = lowerstr2.substring(1);
				result.append(lowerstr2);
			}else {
				result.append(" ").append(lowerstr2);
			}
		}
		System.out.print("concatenated string: "+result);
	}
}
