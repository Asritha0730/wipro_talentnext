package Collection1;

import java.util.Arrays;
import java.util.*;
import java.util.function.Consumer;

public class FunctionalInterface6 {
	 public static void main(String[]args) {
		   
		   List<String> words = Arrays.asList(
		            "madam", "apple", "racecar", "hello", "noon",
		            "level", "java", "radar", "world", "civic"
		        );
		   ArrayList<String> a = new ArrayList<>();
		   
		   Consumer<String> c = word -> {
			  String reversed = new StringBuilder(word).reverse().toString();
			  a.add(reversed);
		   };

		   words.forEach(c);
		   System.out.println("Reversed Words :");
		   a.forEach(System.out::println);
		  
	 }
}
