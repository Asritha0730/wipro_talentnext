package java_fundamentals;
import java.util.*;
public class Question3 {
	public static void add(int a1,int b1) {
		int sum = a1 + b1;
		  System.out.println("the sum of " +a1 + " and "+b1+ " is " +sum);
	}
  public static void main(String[]args) {
	  Scanner sc = new Scanner(System.in);
	  int a = sc.nextInt();
	  int b = sc.nextInt();
	   add(a, b);
	  
  }
}
