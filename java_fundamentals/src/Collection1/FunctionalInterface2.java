package Collection1;

import java.util.*;
import java.util.function.Function;

public class FunctionalInterface2 {
      public static void main(String[]args) {
    	  
    	  List<Integer> l = Arrays.asList(10,20,30,10,20,30,10,20,10,60);
    	  
    	  Function<List<Integer>,Integer> f = list ->{
    		  int sum =0;
    		  for(int num : l) {
    			  sum += num;
    		  }
    		  return sum;
    	  };
    	  int result = f.apply(l);
    	  System.out.println("Sum of the Elements :"+result);
    	  
      }
}
