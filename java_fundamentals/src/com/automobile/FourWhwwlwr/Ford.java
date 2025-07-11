package com.automobile.FourWhwwlwr;

import com.automobile.Vehicle;

public class Ford extends Vehicle{
	
	public int speed() {
		return 45;
	}
	public int tempControl() {
		System.out.println("Temparature is under control");
		return 27;
	}

	@Override
	public String getModelName() {
		// TODO Auto-generated method stub
		return "Ford";
	}

	@Override
	public String getRegistrationNumber() {
		// TODO Auto-generated method stub
		return "TS878";
	}

	@Override
	public String getOwnerName() {
		// TODO Auto-generated method stub
		return "Turner";
	}

}
