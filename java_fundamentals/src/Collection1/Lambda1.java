package Collection1;

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.IntStream;

public class Lambda1 {
      public static void main(String[]args) {
    	  
    	  ArrayList<Integer> al = new ArrayList<>();
    	  Random r = new Random();
    	  
    	  for(int i=0;i<25;i++) {
    		  al.add(r.nextInt(100)+1);
    	  }
    	  System.out.println("Original ArrayList :"+al);
    	  System.out.println("prime numbers :");
    	  al.stream().filter(n -> isPrime(n)).forEach(System.out::println);

    	  
    	  
      }
      public static boolean isPrime(int n) {
          if (n <= 1) return false;
          return IntStream.rangeClosed(2, (int)Math.sqrt(n))
                          .noneMatch(i -> n % i == 0);
      }
}
