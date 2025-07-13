package ExceptionHandling;

import java.nio.InvalidMarkException;
import java.util.Scanner;

 class NegativeValueException extends Throwable {
	
	public NegativeValueException(String message) {
		super(message);
	}
} class marks{
		
		public static int getValidmarks(String input) throws NumberFormatException, NegativeValueException{
			
			int marks = Integer.parseInt(input);
			if(marks<0 || marks>100) {
				throw new NegativeValueException("Enter the values between 0 and 100");
			}
			return marks;
			
		}
		public static void main(String[]args) throws NegativeValueException {
			Scanner sc = new Scanner(System.in)	;
			final int students = 2;
			final int subjects = 3;
			
			
			for(int s =0;s<=students;s++) {
				System.out.println("Enter name :");
				String name = sc.nextLine();
				
				int total =0;
				int count =0;
				
				while(count <subjects) {
					System.out.print("Enter mark " + (count + 1) + ": ");
	                String input = sc.nextLine();
	                
	                try {
	                	int mark = getValidmarks( input);
	                	total += mark;
	                	count++;
	                	
	                }catch (NumberFormatException e) {
	                    System.out.println("Please enter a valid number.");
	                } catch (InvalidMarkException e) {
	                    System.out.println("Error: " + e.getMessage());
	                }
				}
				 double average = total / 3.0;
		            System.out.println("Average marks for " + name + " = " + average);
			}
		
		
		}
		
	}

	
