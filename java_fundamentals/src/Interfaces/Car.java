package Interfaces;

public class Car implements Vehicle,FourWheeler {
   
	    public void message() {
		// TODO Auto-generated method stub
		FourWheeler.super.message();
		Vehicle.super.message();
	    }

		public static void main(String[]args) {
		    	Car c = new Car();
		    	c.message();
		    }
        
}

