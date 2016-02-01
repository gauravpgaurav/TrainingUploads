package com.rentals.rentItems;

import com.rentals.ChennaiRentals;

public class Vessels extends ChennaiRentals {
	private String material;

	public Vessels(String serialNumber,String itemType, String material) {
		super(serialNumber,itemType);
		this.material = material;
	}
	
	public void getItemDetails(){
		
		super.getItemDetails();
		System.out.println("\nMaterial : \t"+material);
	}

}
