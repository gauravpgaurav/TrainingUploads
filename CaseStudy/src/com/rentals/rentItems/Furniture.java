package com.rentals.rentItems;

import com.rentals.RentalItems;

public class Furniture extends RentalItems {

	private String furnitureType;

	public Furniture(String serialNumber, String itemType, String furnitureType, double ratePerDay) {
		super(serialNumber, itemType, ratePerDay);
		this.furnitureType = furnitureType;
	}

	@Override
	public void getItemDetails() {

		super.getItemDetails();
		System.out.println("Furniture Type : \t" + furnitureType);
		System.out.println();
		for (int j = 0; j < 50; j++)
			System.out.print("*");
		System.out.println();

	}
}
