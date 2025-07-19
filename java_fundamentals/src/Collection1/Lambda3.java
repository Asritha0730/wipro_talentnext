package Collection1;

import java.util.*;
import java.util.stream.IntStream;

public class Lambda3 {
   public static void main(String[]args) {
	   
	   List<String> al = new ArrayList<String>(Arrays.asList("Hii",
			   "heloo","How","are","you","people","hope","you","are","doing","well"));
	   
	   
	   IntStream.range(0, al.size())
       .filter(i -> i % 2 != 0)  
       .forEach(i -> System.out.println(al.get(i)));
	   
	   
   }
}
