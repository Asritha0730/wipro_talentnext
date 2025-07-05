package java_fundamentals;

import java.util.Scanner;

public class Question18 {
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);

      System.out.print("Enter number: ");
      String input = sc.nextLine();

      if (input.isEmpty() || !input.matches("\\d+")) {
          System.out.println("Please enter an integer number");
          return;
      }
      int n = Integer.parseInt(input);

      for (int i = 1; i <= n; i++) {
          for (int j = 1; j <= i; j++) {
              System.out.print("* ");
          }
          System.out.println(); 
      }
}
}
