package Collection1;

import java.util.HashMap;
import java.util.Map;

public class HashMap3 {
   
	public static void main(String[]args) {
		
		HashMap<String,String> hm = new HashMap<>();
		hm.put("101", "jay");
		hm.put("102", "Aj");
		hm.put("103", "Honey");
		
		System.out.println("Key exists or not  :" +hm.containsKey("101"));
		System.out.println("Value exists or not:" +hm.containsValue("Honey"));
		System.out.println("Using iterator :");
	    for(Map.Entry<String,String> entry :hm.entrySet()) {
    		
	    	System.out.println(entry.getKey()+": "+entry.getValue());
	    }
		
	}
	
	
	
}
