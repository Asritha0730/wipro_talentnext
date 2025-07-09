package Oops;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String str = sc.nextLine();

        boolean[] remove = new boolean[str.length()]; // marks for deletion

        // First pass: mark characters to remove
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*') {
                if (i > 0) remove[i - 1] = true;     // char before '*'
                remove[i] = true;                    // the '*'
                if (i < str.length() - 1) remove[i + 1] = true; // char after '*'
            }
        }

        // Second pass: build the result
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (!remove[i]) {
                result.append(str.charAt(i));
            }
        }

        System.out.println("Result: " + result.toString());
        sc.close();
    }
}
