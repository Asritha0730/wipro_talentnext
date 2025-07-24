package Collection1.dateApi;

import java.time.LocalDate;

public class Date2 {
   public static void main(String[]args) {
	   LocalDate ld = LocalDate.now();
	   System.out.println("Today's Date :"+ld);
	   System.out.println("Date After 10 days :"+ld.plusDays(10));
   }
}
