package java_fundamentals;

import java.util.Scanner;

public class Question12 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number for a month: ");
		String str = sc.nextLine();

        if (str.isEmpty()) {
            System.out.println("Please enter the month in numbers");
            return;
        }
        int num = Integer.parseInt(str);
	
		switch(num){
		case 1 :
			System.out.println("January");
			break;
	    case 2 :
		    System.out.println("Febraury");
		    break;
	    case 3 :
			System.out.println("March");
			break;
	    case 4 :
		    System.out.println("April");
		    break;
	    case 5 :
			System.out.println("May");
			break;
	    case 6 :
		    System.out.println("June");
		    break;
		case 7 :
			System.out.println("July");
			break;
	    case 8 :
		    System.out.println("August");
		    break;
	    case 9 :
			System.out.println("September");
			break;
	    case 10 :
		    System.out.println("October");
		    break;
	    case 11 :
			System.out.println("November");
			break;
	    case 12 :
		    System.out.println("December");
		    break;
		 default:
			 System.out.println("Invalid Month");
		}
	

   }
}
