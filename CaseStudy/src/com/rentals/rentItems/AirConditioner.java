package com.rentals.rentItems;

import com.rentals.ChennaiRentals;

public class AirConditioner extends ChennaiRentals {
	private double powerRatings;
	private double ratePerDay;
	
	
	public AirConditioner(String serialNumber, String itemType, double powerRatings, double ratePerDay) {
		super(serialNumber, itemType, ratePerDay);
		this.powerRatings = powerRatings;
	}


	public void getItemDetails(){
		
		super.getItemDetails();
		System.out.println("Power Ratings : \t"+powerRatings);
		System.out.println();
		for(int j=0; j<50; j++)
			System.out.print("*");
		System.out.println();

	}
}
