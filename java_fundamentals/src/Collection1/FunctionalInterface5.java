package Collection1;

import java.util.*;
import java.util.function.Predicate;

public class FunctionalInterface5 {
   public static void main(String[]args) {
	   
	   List<Integer> l = Arrays.asList(1,4,6,9,16,25,49,63,81,23);
	   
	   Predicate<Integer> p = num ->{int sqrt =(int) Math.sqrt(num);
	   return sqrt*sqrt == num; };
	   System.out.println("Perfect squares :");
	   l.stream().filter(p).forEach(System.out::println);
   }
}
