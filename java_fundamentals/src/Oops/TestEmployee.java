package Oops;

import java.util.Scanner;

public class TestEmployee {
      public static void main(String[]args) {
    	  Scanner sc = new Scanner(System.in);
    	  
    		System.out.println("Enter name:");
			String name = sc.nextLine();
			
			Person p = new Person(name);
			
			System.out.println("Enter annual sal :");
			double annual_sal = sc.nextDouble();
			System.out.println("Enter year :");
			int year = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter insurance :");
			String insuranceNum = sc.nextLine();
		
			
    	  Employee e = new Employee(annual_sal,year,insuranceNum,name);
    	  
    	  System.out.println("----Employee details----");
    	  System.out.println("Employee Name :"+e.getName());
    	  System.out.println("Employee sal :"+e.getAnnual_sal());
    	  System.out.println("Employee year :"+e.getYear());
    	  System.out.println("Employee insurance num :"+e.getInsuranceNum());
      }
}
