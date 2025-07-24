package Collection1.dateApi;

import java.time.LocalDate;
import java.time.Period;

public class Date4 {
  public static void main(String[]args) {
	  LocalDate l = LocalDate.now();
	  
	  LocalDate joiningdate = LocalDate.of(l.getYear(), l.getMonth(), 7);
	  
	  
	  Period experience = Period.between(joiningdate, l);
	  
	  System.out.println("Joining date "+joiningdate+" is:");
	  System.out.println(experience.getYears()+" Years ");
	  System.out.println(experience.getMonths()+" Months");
	  System.out.println(experience.getDays()+" Days.");
  }
}
