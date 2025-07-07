package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Question29 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array :");
		int n = sc.nextInt();
		
		System.out.print("Enter the array Elements : ");
		int[] arr = new int[n];
		for(int i =0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		  
		}
		  System.out.println("Array is :"+Arrays.toString(arr)+" ");
		  
		  int []arr1 = new int[n];
		 int index = 0;
		for(int i=0;i<arr.length;i++) {
		if(arr[i]!=10) {
			arr1[index] = arr[i];
			index++;
		  }
		}
		System.out.print("After removing 10 :"+Arrays.toString(arr1));
		
	}
	
}
