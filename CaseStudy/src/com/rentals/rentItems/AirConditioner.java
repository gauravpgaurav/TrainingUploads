package com.rentals.rentItems;

import com.rentals.ChennaiRentals;

public class AirConditioner extends ChennaiRentals {
	private double powerRatings;

	public AirConditioner(String serialNumber,String itemType, double powerRatings) {
		super(serialNumber,itemType);
		this.powerRatings = powerRatings;
	}
	
	public void getItemDetails(){
		
		super.getItemDetails();
		System.out.println("\nPower Ratings : \t"+powerRatings);
	}
}
