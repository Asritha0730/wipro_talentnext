package java_fundamentals;

import java.util.Scanner;

public class Question9 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the gender : ");
		String gender = sc.nextLine();
		
		System.out.println("Age is :");
		int age = sc.nextInt();
		
		if(gender.equals("Female")) {
			if(age>=1 && age<=58) {
				System.out.println("The percentage of interest is 8.2%");
				
			}else if(age>=59 && age<=100) { 
				System.out.println("The percentage of interest is 9.2%");
			}else {
				System.out.println("not interested");
			}
		}
		else if(gender.equals("Male")) {
			if(age>=1 && age<=58) {
				System.out.println("The percentage of interest is 8.4%");
				
			}else if(age>=59 && age<=100) { 
				System.out.println("The percentage of interest is 10.5%");
			}else {
				System.out.println("not interested");
			}
			
		}
		
	}

}
