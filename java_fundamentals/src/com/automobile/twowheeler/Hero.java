package com.automobile.twowheeler;

import com.automobile.Vehicle;

public class Hero extends Vehicle {
	 int Speed;
	 String radio;
	 
	public  Hero(int Speed,String radio) {
		 this.Speed = Speed;
		 this.radio = radio;
	 }
	
	public int getSpeed() {
		return Speed;
	}
	public void setSpeed(int Speed) {
		this.Speed  =Speed;
	}
	public String getRadio() {
		return radio;
	}
	public void setRadio(String radio) {
		this.radio=radio;
	}

	@Override
	public String getModelName() {
		// TODO Auto-generated method stub
		return"Hero ";
	}

	@Override
	public String getRegistrationNumber() {
		// TODO Auto-generated method stub
		return "24353";
	}

	@Override
	public String getOwnerName() {
		// TODO Auto-generated method stub
		return "Charu";
	}

}
