package java_fundamentals;
import java.util.Scanner;

public class Question8 {
   public static void main(String[]args) {
	   Scanner s = new Scanner(System.in);
	   char c = s.next().charAt(0);
	   if((c >='a' && c <='z') || (c >='A' && c<='Z')) {
		   System.out.println("Alphabet");
	   }
	   else if(c >=0 || c<=9) {
		   System.out.println("Digits");
	   }
	   else {
		   System.out.println("Special Character");
	   }
   }
}
