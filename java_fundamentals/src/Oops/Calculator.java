package Oops;

import java.util.Scanner;

public class Calculator {
	int num1;
	int num2;
	public static int powerInt(int num1,int num2) {
    	return (int)Math.pow(num1, num2);
		
	}
	public static double powerDouble(double num1,double num2) {
		return Math.pow(num1, num2);
	}
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int result1 =Calculator.powerInt(num1, num2);
		double num11 = sc.nextDouble();
		double num12 = sc.nextDouble();
		double result2 =Calculator.powerDouble(num1, num2);
		
		System.out.println("power of int :"+result1);
		System.out.println("power of double :"+result2);
		
		}

}
