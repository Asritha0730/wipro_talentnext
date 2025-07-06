package java_fundamentals;

import java.util.Scanner;

public class Question23 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array :");
		int n = sc.nextInt();
		int [] arr=new int[n];
		System.out.println("enter the array elements: ");
		for(int i =0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the search elements: ");
		int search = sc.nextInt();
		
		int index = findIndex(arr,search);
		System.out.println(index);
		
	}
	
	public static int findIndex(int[]arr,int search) {
		for(int i = 0;i < arr.length;i++) {
			if(arr[i]==search) {
				return i;
			}
		}
		return -1;
	}

}
