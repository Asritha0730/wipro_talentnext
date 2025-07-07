package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Question25 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size :");
		int n = sc.nextInt();
		
		if(n < 2) {
			System.out.println("Give more than 2 elements");
			return;
		}
		
		System.out.println("Enter the array elements :");
		int [] arr = new int[n];
		for(int i =0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		Arrays.sort(arr);
		System.out.println("Smallest elements are " +arr[0]+" , " +arr[1]);
		System.out.println("Largest elements are "+arr[n-2]+" , "+arr[n-1]);
		
	}

}
