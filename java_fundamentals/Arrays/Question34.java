package Arrays;

import java.util.Scanner;

public class Question34 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the 9 integers: ");
		int [][]arr=new int[3][3];
		int index = 0;
		int max = Integer.MIN_VALUE;
		 for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	            	 arr[i][j] =sc.nextInt();
	            	 if (arr[i][j] > max) {
	                     max = arr[i][j];
	                 }
	             }
	      }
		    System.out.println("The given array is :");
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                System.out.print(arr[i][j] + " ");
	            }
	            System.out.println();
	        }
	        System.out.println("The biggest number in the given array is " + max);
		
	}

}
