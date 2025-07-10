package Oops;

import java.util.Scanner;

public class Question10 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter string:");
	        String str = sc.nextLine();
	        System.out.println("Enter num :");
	        int num = sc.nextInt();
	        
	        String last = str.substring(str.length()-num);
	        
	        StringBuilder sb = new StringBuilder();
	        for(int i=0;i<num;i++) {
	        	sb.append(last);
	        }
	        System.out.println("Result :"+sb.toString());
	        sc.close();
	 }
}
