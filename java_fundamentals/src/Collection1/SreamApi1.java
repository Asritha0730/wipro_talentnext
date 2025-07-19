package Collection1;

import java.util.*;

public class SreamApi1 {
   public static void main(String[]args) {
	   
	   List<Integer> l = Arrays.asList(5,-2,3,-4,-8,6,-9,-10);
	   
	   List<Integer> l1 = new ArrayList<>();
	   
	   for(int num : l) {
		   if(num<0 && num % 2 ==0) {
			   l1.add(num);
		   }
	   }
	   System.out.println("negative even integers :"+l1);
	   
   }
}
