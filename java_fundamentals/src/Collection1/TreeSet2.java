package Collection1;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet2 {
    private TreeSet<String> t1 = new TreeSet<>();
    
    public TreeSet<String> saveCountryName(String CountryName){
    	
    	t1.add(CountryName);
    	return t1;
  	
    }
    
    public String getCountry(String CountryName) {
    	
    	Iterator<String> it = t1.iterator();
    	while(it.hasNext()) {
    		String country = it.next();
    		if(country.equalsIgnoreCase(CountryName)) {
    			return country;
    		}
    	}
    	return null;
    }
    public static void main(String[]args) {
    	TreeSet2 ts = new TreeSet2();
    	ts.saveCountryName("India");
    	ts.saveCountryName("japan");
    	ts.saveCountryName("Italy");
    	ts.saveCountryName("Norway");
    	
    	System.out.println("Search for Italy :"+ts.getCountry("Italy"));
    	
    }
}
