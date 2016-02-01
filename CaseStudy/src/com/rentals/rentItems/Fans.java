package com.rentals.rentItems;

import com.rentals.ChennaiRentals;

public class Fans extends ChennaiRentals {

	private int numberOfBlades;
	private double ratePerDay;


	public Fans(String serialNumber, String itemType,int numberOfBlades, double ratePerDay) {		
		super(serialNumber, itemType, ratePerDay);
		this.numberOfBlades = numberOfBlades;
	}


	public void getItemDetails(){
		
		super.getItemDetails();
		System.out.println("Number of Blades : \t"+numberOfBlades);
		
		for(int j=0; j<50; j++)
			System.out.print("*");
		System.out.println();

	}
}
