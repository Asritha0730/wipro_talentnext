package Collection1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMap2 {
    
     private HashMap<String,String> h1 = new HashMap<>(); 
     public HashMap<String,String> saveCountryCapital(String CountryName,String Capital) {
    	  h1.put(CountryName,Capital);
    	  return h1;
      }
     public String getCapital(String CountryName) {
    	 return h1.get(CountryName);
     }
     
     public String getCountryName(String Capital) {
    	 for(Map.Entry<String, String> entry :h1.entrySet()) {
    		 if(entry.getValue().equals(Capital)) {
    			return entry.getKey();
    		 }
    	 }
    	 return null;
     }
     public HashMap<String, String> reverseMap() {
         HashMap<String, String> m2 = new HashMap<>();
         for (Map.Entry<String, String> entry : h1.entrySet()) {
             m2.put(entry.getValue(), entry.getKey()); 
         }
         return m2;
     }
     public ArrayList<String> getAllCountries() {
         return new ArrayList<>(h1.keySet());
     }
     public static void main(String[] args) {
         HashMap2 cm = new HashMap2();

         
         cm.saveCountryCapital("India", "Delhi");
         cm.saveCountryCapital("Japan", "Tokyo");

       
         System.out.println("Capital of India: " + cm.getCapital("India"));

          System.out.println("Country with capital Tokyo: " + cm.getCountryName("Tokyo"));

      
         HashMap<String, String> reversed = cm.reverseMap();
         System.out.println("Reversed Map (Capital -> Country): " + reversed);

 
         ArrayList<String> countries = cm.getAllCountries();
         System.out.println("All Countries: " + countries);
     }
     
}
