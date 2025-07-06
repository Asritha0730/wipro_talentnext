package java_fundamentals;

import java.util.Scanner;

public class Question31 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array :");
		int n = sc.nextInt();
		
		System.out.print("Enter the array elements :");
		int []arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		boolean key = true;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] != 1 && arr[i] !=4) {
				key = false;
				break;
			}
		}
		System.out.println(key);
		
	}

}
