package com.rentals.rentItems;

import com.rentals.ChennaiRentals;

public class Furniture extends ChennaiRentals {

	private String furnitureType;
	private double ratePerDay;
	

	public Furniture(String serialNumber, String itemType,String furnitureType, double ratePerDay) {
		super(serialNumber, itemType, ratePerDay);
		this.furnitureType = furnitureType;
	}

	public void getItemDetails(){
		
		super.getItemDetails();
		System.out.println("Furniture Type : \t"+furnitureType);
		System.out.println();
		for(int j=0; j<50; j++)
			System.out.print("*");
		System.out.println();

	}
}
