package java_fundamentals;
import java.util.Scanner;

public class Question7 {
   public static void main(String[]args) {
	   Scanner sc = new Scanner(System.in);
	   char c = sc.next().charAt(0);
	   char c2 = sc.next().charAt(0);
	   if(c > c2) {
		   System.out.print(c2 +","+c);
	   }
	   else {
		   System.out.print(c +","+c2);
	   }
	   
	   
	   
   }
}
