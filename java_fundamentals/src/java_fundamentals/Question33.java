package java_fundamentals;

import java.util.Scanner;

public class Question33 {
	public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	
	int [][] arr = new int[2][2];
	
	System.out.print("Enter the 4 elemets :");
	for(int i=0;i<arr.length;i++){
		for(int j=0;j<arr.length;j++) {
			arr[i][j]=sc.nextInt();
		}
	}
	System.out.println("The given array is :");
    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 2; j++) {
            System.out.print(arr[i][j] + " ");
  
        }
        System.out.println();
    }
    
    System.out.println("The Reversed array is :");
    for(int i =1;i>=0;i--) {
    	for(int j =1;j>=0;j--) {
    		 System.out.print(arr[i][j] + " ");
    	}
    	 System.out.println();
    }
  }
}