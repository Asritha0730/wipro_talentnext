package Collection1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMap1 {
    public static void main(String[]args) {
    	
    	TreeMap<String,Double> hm = new TreeMap<String,Double>();
    	
    	hm.put("John",252.2 );
    	hm.put("Karan", 92387.4);
    	hm.put("John father",25223.2 );
    	hm.put("Karan sis", 987.4);
    	Set set = hm.entrySet();
    	Iterator it = set.iterator();
    	
    	while(it.hasNext()) {
    		Map.Entry me = (Map.Entry)it.next();
    		System.out.println(me.getKey()+": "+me.getValue());
    		
    	}
    	double balance = ((Double)hm.get("John").doubleValue());
    	hm.put("John", 2342.2);
    	System.out.println("New balance of john :");
    	System.out.println(hm.get("John"));
    	
    	
    	
    }
}
