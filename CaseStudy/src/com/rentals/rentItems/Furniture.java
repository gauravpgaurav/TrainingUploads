package com.rentals.rentItems;

import com.rentals.ChennaiRentals;

public class Furniture extends ChennaiRentals {

	private int numberOfPieces;

	public Furniture(String serialNumber,String itemType, int numberOfPieces) {
		super(serialNumber,itemType);
		this.numberOfPieces = numberOfPieces;
	}
	
	public void getItemDetails(){
		
		super.getItemDetails();
		System.out.println("\nNumber of Pieces : \t"+numberOfPieces);
	}
}
