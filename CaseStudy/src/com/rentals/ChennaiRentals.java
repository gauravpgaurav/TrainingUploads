package com.rentals;

abstract public class ChennaiRentals {
	
	private String serialNumber;
	private String itemType;

	public ChennaiRentals(String serialNumber,String itemType) {
		super();
		this.serialNumber = serialNumber;
		this.itemType = itemType;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	
	public void getItemDetails(){
		
		System.out.println("\nSerial Number : \t"+serialNumber);
		System.out.println("\nItem Type : \t"+itemType);
	}
	

}
