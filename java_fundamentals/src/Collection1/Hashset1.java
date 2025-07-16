package Collection1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class Hashset1 {
      private HashSet<String> h1 = new HashSet<>();
	public HashSet<String> saveCountryName(String CountryName){
		h1.add(CountryName);
		return h1;
	}
	
	public String getCountry(String CountryName){
		Iterator<String> it = h1.iterator();
		while(it.hasNext()) {
			String country = it.next();
			if(country.equalsIgnoreCase(CountryName)) {
				return country;
			}
		}
		return null;
	}
	public static void main(String[]args) {
		Hashset1 h2 = new Hashset1();
		
		h2.saveCountryName("India");
		h2.saveCountryName("Japan");
		h2.saveCountryName("Norway");
		h2.saveCountryName("Italy");
		
		
		System.out.println("Serach for India:"+h2.getCountry("India"));
		
		System.out.println("Serach for Usa:"+h2.getCountry("Usa"));
	}
	
}
