package Arrays;

import java.util.Scanner;

public class Question24 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the Ascii values :");
	        String [] arr =sc.nextLine().split(" ");
	        for(int i =0;i < arr.length;i++) {
	        	int ascii = Integer.parseInt(arr[i]);
	        	char ascii2 = (char) ascii;
	        	System.out.println(ascii2+" ");
	        }
	 }

}
