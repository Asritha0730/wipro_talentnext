package com.automobile.FourWhwwlwr;

public class TestFourWheeler {
	public static void main(String[]args) {
	Logan l = new Logan();
	System.out.println("========Logan Vehicle======");
	System.out.println("MODEL name :"+l.getModelName());
	System.out.println("Registration number :"+l.getRegistrationNumber());
	System.out.println("Owner name :"+l.getOwnerName());
	System.out.println("Speed :"+l.speed());
	System.out.println("gps  :"+l.gps());
	
	Ford f= new Ford();
	System.out.println("========Ford Vehicle======");
	System.out.println("MODEL name :"+f.getModelName());
	System.out.println("Registration number :"+f.getRegistrationNumber());
	System.out.println("Owner name :"+f.getOwnerName());
	System.out.println("Speed :"+f.speed());
	System.out.println("Temparate control  :"+f.tempControl());
	
	}

}
