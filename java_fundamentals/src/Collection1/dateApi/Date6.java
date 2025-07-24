package Collection1.dateApi;

import java.time.LocalTime;

public class Date6 {
  public static void main(String[]args) {
	  LocalTime lt = LocalTime.now();
	  System.out.println("Current time :"+lt);
	  System.out.println("Time After 25 minutes :"+lt.plusMinutes(25));
	  System.out.println("Time Before 5 hours 30 minutes: :"+lt.minusHours(5).minusMinutes(30));
	  System.out.println("Time After 5 hours 30 minutes: :"+lt.plusHours(5).plusMinutes(30));
  }
}
