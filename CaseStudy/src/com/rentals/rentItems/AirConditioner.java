package com.rentals.rentItems;

import com.rentals.ChennaiRentalItems;

public class AirConditioner extends ChennaiRentalItems {
	private double powerRatings;
	private double ratePerDay;
	
	
	public AirConditioner(String serialNumber, String itemType, double powerRatings, double ratePerDay) {
		super(serialNumber, itemType, ratePerDay);
		this.powerRatings = powerRatings;
	}

	@Override
	public void getItemDetails(){
		
		super.getItemDetails();
		System.out.println("Power Ratings : \t"+powerRatings);
		System.out.println();
		for(int j=0; j<50; j++)
			System.out.print("*");
		System.out.println();

	}
}
