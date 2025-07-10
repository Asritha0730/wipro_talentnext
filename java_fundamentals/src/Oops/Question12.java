package Oops;

import java.util.Scanner;
import java.util.StringJoiner;

public class Question12 {
   public static void main(String[]args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("enter no of cities :");
	   int n = sc.nextInt();
	   sc.nextLine();
	 
	   
	   StringJoiner s1 =new StringJoiner("-","[","]");
	   for(int i =0;i<n;i++) {
		   System.out.print(" cities "+(i+1)+":");
		   String str1 = sc.nextLine();
		   s1.add(str1);
	   }
	   StringJoiner s2 =new StringJoiner("-");
	   for(int i =0;i<n;i++) {
		   System.out.print(" cities "+(i+1)+":");
		   String str2 = sc.nextLine();
		   s1.add(str2);
	   }
	   
	   System.out.println(" cities :"+s1.merge(s2));
	   System.out.println(" cities :"+s2.merge(s1));
	   
	   
	   
   }
	
	
}
