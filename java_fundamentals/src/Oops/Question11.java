package Oops;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringJoiner;

public class Question11 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num of Name:");
        int n = sc.nextInt();
        sc.nextLine();
        
        StringJoiner sj = new StringJoiner(",", "{", "}");
        
        ArrayList<String> array = new ArrayList<String>();
        for(int i =0;i<n;i++) {
        	  System.out.print("Enter  Name "+(i+1)+":");
        	  String str = sc.nextLine();
              array.add(str);
        }
       
        
        array.forEach(element -> sj.add(element));
        System.out.println("output :" +sj);
        
	}
	
}
