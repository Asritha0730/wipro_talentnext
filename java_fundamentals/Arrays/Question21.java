package Arrays;

import java.util.Scanner;

public class Question21 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int n = sc.nextInt();
		int [] arr = new int[n];
		int sum = 0;
		System.out.println("Enter array elements");
		for(int i = 0;i<n;i++) {
			arr[i]=sc.nextInt();
			sum +=arr[i];
		}
		double average = (double)sum / n;
		System.out.println("Sum is : "+sum);
		System.out.println("Average is : "+average);
		
		
	}

}
