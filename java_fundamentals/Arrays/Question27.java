package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Question27 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array :");
		int n = sc.nextInt();
		
		System.out.print("Enter the array Elements : ");
		int[] arr = new int[n];
		for(int i =0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
		}
		Arrays.sort(arr);
		
		System.out.println("After sorting : "+Arrays.toString(arr));
		System.out.print("After removing duplicates :");
		System.out.print(arr[0]+" ");
		
		for(int i = 1;i<arr.length;i++) {
			if(arr[i] != arr[i-1]) {
				System.out.print(arr[i]+" ");
			}
		}
		
		
		
		
	}
}
