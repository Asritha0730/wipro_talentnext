package Collection1;

import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class HashTable {
     public static void main(String[]args) {
    	 
    	 Properties state = new Properties();
    	 state.setProperty("Andhra Pradesh", "Amaravati");
    	 state.setProperty("karnataka", "Benguluru");
    	 state.setProperty("TamilNadu", "Chennai");
    	 state.setProperty("Mahrastra", "Mumbai");
    	 
    	 
    	 Set<Map.Entry<Object,Object>> entryset = state.entrySet();
    	 Iterator<Map.Entry<Object,Object>> it = entryset.iterator();
    	 
    	  System.out.println("Indian States and their Capitals:");
          while (it.hasNext()) {
              Map.Entry<Object, Object> entry = it.next();
              System.out.println(entry.getKey() + " → " + entry.getValue());
          }
    	 
     }
}
