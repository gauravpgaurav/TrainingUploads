package com.rentals.rentItems;

import com.rentals.ChennaiRentals;

public class Vessels extends ChennaiRentals {
	private String material;
	private double ratePerDay;
	
	public Vessels(String serialNumber, String itemType, String material, double ratePerDay) {
		super(serialNumber, itemType, ratePerDay);
		this.material = material;
	}


	public void getItemDetails(){
		
		super.getItemDetails();
		System.out.println("Material : \t\t"+material);
		System.out.println();
		for(int j=0; j<50; j++)
			System.out.print("*");
		System.out.println();

	}

}
