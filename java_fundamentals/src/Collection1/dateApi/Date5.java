package Collection1.dateApi;

import java.time.LocalDate;
import java.time.Year;

public class Date5 {
    public static void main(String[]args) {
//    	LocalDate l = LocalDate.of(2025, 07, 22);
//    	System.out.println("Leap Year or not :"+l.isLeapYear());
    	
    	int currentYear = Year.now().getValue();
    	
    	boolean isLeap = Year.isLeap(currentYear);
    	if(isLeap) {
    		System.out.println(currentYear+" is a leap Year.");
    	}else {
    		System.out.println(currentYear+" is not a leap Year.");
    	}
    	
    }
}
