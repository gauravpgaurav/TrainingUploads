package com.rentals.rentItems;

import com.rentals.ChennaiRentals;

public class Fans extends ChennaiRentals {

	private int numberOfBlades;

	public Fans(String serialNumber,String itemType, int numberOfBlades) {
		super(serialNumber,itemType);
		this.numberOfBlades = numberOfBlades;
	}
	
	public void getItemDetails(){
		
		super.getItemDetails();
		System.out.println("\nNumber of Blades : \t"+numberOfBlades);
	}
}
