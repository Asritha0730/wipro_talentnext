package com.automobile.FourWhwwlwr;

import com.automobile.Vehicle;

public class Logan extends Vehicle {
	public int speed() {
		return 60;
		
	}
	public int gps() {
		System.out.println("Gps is active now");
		return 5;
	}

	@Override
	public String getModelName() {
		// TODO Auto-generated method stub
		return "Logan Model";
	}

	@Override
	public String getRegistrationNumber() {
		// TODO Auto-generated method stub
		return "Ap24242";
	}

	@Override
	public String getOwnerName() {
		// TODO Auto-generated method stub
		return "Smith";
	}

}
