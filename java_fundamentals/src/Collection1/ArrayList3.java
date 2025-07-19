package Collection1;

import java.util.ArrayList;

public class ArrayList3 {
	 public static void main(String[] args) {
		 
		 ArrayList<Number> num = new ArrayList<>();
		 num.add(07);
		 num.add(30.34);
		 num.add(23.2f);
		 num.add(123345L);
		 
		 System.out.println("numbers in List :");
//		 for(Number numbers:num) {
//			 System.out.println(numbers);
//		 }
		 num.forEach(number -> System.out.println(number));
		 
	 }
}
