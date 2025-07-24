package Collection1.dateApi;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class Date1 {
   public static void main(String[]args) {
	   LocalDateTime l = LocalDateTime.now();
	   System.out.println("Today's Date and time:"+l);
	   System.out.println("Day of week :"+l.get(ChronoField.DAY_OF_WEEK));
	   System.out.println("Day of month :"+l.get(ChronoField.DAY_OF_MONTH));
	   System.out.println("Day of year :"+l.get(ChronoField.DAY_OF_YEAR));
	   System.out.println("Hour of  day :"+l.get(ChronoField.HOUR_OF_DAY));
	   System.out.println("Minute of day :"+l.get(ChronoField.MINUTE_OF_DAY));
   }
}
