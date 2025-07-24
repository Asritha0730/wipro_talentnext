package Collection1.dateApi;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Date3 {
   public static void main(String[]args) {
	   LocalDate ld = LocalDate.now();
	   
	   LocalDate firstday = ld.plusMonths(1).withDayOfMonth(1);
	   
	   LocalDate sunday = firstday;
	   while(sunday.getDayOfWeek() !=DayOfWeek.SUNDAY) {
		   sunday = sunday.plusDays(1);
	   }
	   LocalDate secondSunday = sunday.plusWeeks(1);
	   System.out.println("Next month second Sunday date :"+secondSunday);
	   
   }
}
