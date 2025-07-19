package Collection1;

import java.util.*;

public class Lambda2 {
     public static void main(String[]args) {
    	 List<String> list = new ArrayList<>();
    	 list.add("Hi");
    	 list.add("Hello");
    	 list.add("how");
    	 list.add("are");
    	 list.add("you");
    	 list.add("Hiiii");
    	 list.add("Helloooo");
    	 list.add("howww");
    	 list.add("areee");
    	 list.add("youuuu");
    	 
    	 Collections.reverse(list);
    	 list.forEach(word -> System.out.println(word));
    	 
    	 
     }
}
