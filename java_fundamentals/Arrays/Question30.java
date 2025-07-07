package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Question30 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int n = sc.nextInt();
		
		System.out.println("Enter the array elements :");
		int [] arr = new int[n];
		for(int i = 0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		int[] arr1 = new int[n];
		int index = 0;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i] % 2 ==0) {
				arr1[index] = arr[i];
				index++;
			}
		}
		for(int i = 0;i<arr.length;i++) {
			if(arr[i] % 2 != 0) {
				arr1[index] = arr[i];
				index++;
			}
		}
		
		System.out.println("Arrays is "+Arrays.toString(arr1));
		
		
		
	}
}
