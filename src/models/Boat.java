package models;

import utilities.ColorType;

public class Boat extends Vehicle {

	private int length;
	private boolean sailBoat;
	
	public Boat(String brandName, String modelYear, String regNumber, double weight, ColorType color, int length, boolean sailBoat) {
		super(brandName, modelYear, regNumber, weight, color);
		this.length = length;
		this.sailBoat = sailBoat;
	}

	public int getLength() {
		return length;
	}

	public boolean isSailBoat() {
		return sailBoat;
	}


}
