package java_fundamentals;

import java.util.Scanner;

public class Question11 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the color code: ");
		char ch = sc.next().charAt(0);
		ch = Character.toUpperCase(ch);
		switch(ch) {
		case 'R' :
			System.out.println("RED");
			break;
	    case 'B' :
		    System.out.println("BLUE");
		    break;
	    case 'G' :
			System.out.println("GREEN");
			break;
	    case 'O' :
		    System.out.println("ORANGE");
		    break;
	    case 'Y' :
			System.out.println("YELLOW");
			break;
	    case 'W' :
		    System.out.println("WHITE");
		    break;
		 default:
			 System.out.println("Invalid Code");
	    
	}

   }
}
