package WrapperClasses;

public class WrapperClass5 implements Cloneable{
	int id ;
	String name;
	WrapperClass5(int id,String name){
		this .id = id;
		this.name = name;
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	 void display() {
	        System.out.println("ID: " + id + ", Name: " + name);
	    }
          
	public static void main(String[]args) throws CloneNotSupportedException {
		
		WrapperClass5 wc = new WrapperClass5(34,"Shannu");
		WrapperClass5 wc2 = (WrapperClass5) wc.clone();	
		
		wc.id = 35;
		wc.name="Munnu";
		  System.out.println("Original Employee:");
          wc.display();

          System.out.println("Cloned Employee:");
          wc.display();
		
	}
	
	
	
}
