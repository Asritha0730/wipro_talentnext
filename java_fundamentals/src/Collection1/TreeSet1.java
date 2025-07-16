package Collection1;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {
       public static void main(String[]args) {
	TreeSet<String> ts = new TreeSet<>();
	ts.add("Car");
	ts.add("Bike");
	ts.add("Van");
	ts.add("Jeep");
	
	System.out.println("Elements on the set :"+ts);
	System.out.println("Using iterator");
	Iterator<String> it = ts.iterator();
	while(it.hasNext()) {
		String Objects = it.next();
		System.out.println(Objects);
	}
	System.out.println("Reversing the elements :");
	Iterator<String> it2 = ts.descendingIterator();
	while(it2.hasNext()) {
		String Objects = it2.next();
		System.out.println(Objects);
	}
	System.out.println("Elements Exists  :"+ts.contains("Car"));
	
	
       }
}
