package java_fundamentals;
import java.util.Scanner;

public class Question4B {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a > 0 & b > 0) {
			if(a%10 == b%10) {
				System.out.println("True");
			}
			else {
				System.out.println("False");
			}
		}
	}

}
