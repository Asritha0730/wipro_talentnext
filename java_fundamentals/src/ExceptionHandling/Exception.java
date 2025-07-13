package ExceptionHandling;

import java.util.Scanner;

public class Exception {
        public static void main(String[]args) {
        	Scanner sc = new Scanner(System.in);
        	
        	try {
        		
        	
        	System.out.println("Enter the Num of elements in the array :");
        	int n = sc.nextInt();
        	System.out.println("Enter the Array elements :");
        	int[] arr = new int[n];
        	
        	for(int i=0;i<n;i++) {
        		arr[i]=sc.nextInt();
        		
        		}
        	System.out.println("Enter the index of the element u want to access :");
    		int index = sc.nextInt();
    		System.out.println("the array element at index" +index+ " = " +arr[index]);
            System.out.println("The array element successfully accessed");
        	
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("java.lang.ArrayIndexOutOfBoundsException");
        } catch (NumberFormatException ae) {
            System.out.println("java.lang.NumberFormatException");
        }
        
        }
}
