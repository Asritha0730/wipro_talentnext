package java_fundamentals;

import java.util.Arrays;
import java.util.Scanner;

public class Question32 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the 3 elements :");
		int []a = new int[3];
		for(int i=0;i<3;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("enter the 3 elements of arr 2 :");
		int [] b= new int[3];
		for(int i=0;i<3;i++) {
			b[i]=sc.nextInt();
		}
		
		int[] result = new int[2];
		result[0]=a[1];
		result[1]=b[1];
		System.out.println("Middle elements are :"+Arrays.toString(result));
		
	}

}
