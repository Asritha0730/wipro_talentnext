package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Question26 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array :");
		int n = sc.nextInt();
		
		System.out.println("Enter the array Elements : ");
		int[] arr = new int[n];
		for(int i =0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
		}
		System.out.println("Array before sorted :"+Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Array after sorted :"+Arrays.toString(arr));
		
		
		
	}

}
