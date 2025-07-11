package com.automobile.twowheeler;

import com.automobile.Vehicle;

public class Honda extends Vehicle {
     
	 int Speed;
	 String CdPlay;
	 
	public  Honda(int Speed,String CdPlay) {
		 this.Speed = Speed;
		 this.CdPlay = CdPlay;
	 }
	
	public int getSpeed() {
		return Speed;
	}
	public void setSpeed(int Speed) {
		this.Speed  =Speed;
	}
	public String getCdPlay() {
		return CdPlay;
	}
	public void setCdPlay(String CdPlay) {
		this.CdPlay = CdPlay;
	}

	@Override
	public String getModelName() {
		// TODO Auto-generated method stub
		return "Honda Model";
	}

	@Override
	public String getRegistrationNumber() {
		// TODO Auto-generated method stub
		return "23243";
	}

	@Override
	public String getOwnerName() {
		// TODO Auto-generated method stub
		return "Mithra";
	}
}
