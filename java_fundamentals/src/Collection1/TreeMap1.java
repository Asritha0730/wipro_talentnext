package Collection1;
import java.util.*;
public class TreeMap1 {
   
	private TreeMap<String,String> tm = new TreeMap<>();
	
	public TreeMap saveCountryName(String CountryName,String capital) {
		tm.put(CountryName, capital);
	   return tm;
	}
	public String getCapital(String CountryName) {
		return tm.get(CountryName);
	}
	
	public String getCountry(String capital) {
		for(Map.Entry<String, String> entry :tm.entrySet()) {
			if(entry.getValue().equals(capital)) {
				return tm.firstKey();
			}
		}
		return null;
	}
	public TreeMap<String,String> reverseMap(){
		TreeMap<String,String> ts = new TreeMap<>();
		for(Map.Entry<String, String> entry :tm.entrySet()) {
			ts.put(entry.getValue(),entry.getKey());
		}
		return ts;
	}
	public ArrayList<String> GetAllCountries(){
		return new ArrayList<>(tm.keySet());
	}
    public static void main(String[] args) {
       TreeMap1 cm = new TreeMap1();

        
        cm.saveCountryName("India", "Delhi");
        cm.saveCountryName("Japan", "Tokyo");

      
        System.out.println("Capital of India: " + cm.getCapital("India"));

         System.out.println("Country with capital Tokyo: " + cm.getCountry("Tokyo"));

     
        TreeMap<String, String> reversed = cm.reverseMap();
        System.out.println("Reversed Map (Capital -> Country): " + reversed);


        ArrayList<String> countries = cm.GetAllCountries();
        System.out.println("All Countries: " + countries);
    }
}
