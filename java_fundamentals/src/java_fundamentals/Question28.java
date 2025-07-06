package java_fundamentals;
import java.util.Scanner;

public class Question28 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int n = sc.nextInt();
		
		System.out.println("Enter the array elements :");
		int [] arr = new int[n];
		for(int i = 0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		int sum =0;
		boolean skip = false;
		
		for(int i =0;i<arr.length;i++) {
			if(arr[i]==6) {
				skip=true;
				continue;
			}
			if(arr[i]==7) {
				skip=false;
				continue;
			}
			if(!skip) {
				sum +=arr[i];
			}
		}
		System.out.println("After skipping from 6 to 7  sum is :" +sum);
	}
	

}
