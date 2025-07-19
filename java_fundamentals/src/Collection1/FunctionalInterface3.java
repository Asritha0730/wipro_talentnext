package Collection1;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FunctionalInterface3 {
   public static void main(String[]args) {
	   
	   List<String> words = Arrays.asList(
	            "madam", "apple", "racecar", "hello", "noon",
	            "level", "java", "radar", "world", "civic"
	        );

	   Predicate<String> p = word -> 
		   word.equalsIgnoreCase(new StringBuilder(word).reverse().toString());
	   
	   
		   List<String> palindromes = words.stream()
                   .filter(p)
                   .collect(Collectors.toList());

		   System.out.println("Palindromic Words: " + palindromes);
   }
}
