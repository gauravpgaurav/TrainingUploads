package com.rentals;

abstract public class ChennaiRentals {
	
	private String serialNumber;
	private String itemType;
	private int rentDays;
	private double ratePerDay;
	private int numberOfItems;
	
	public ChennaiRentals(String serialNumber, String itemType, double ratePerDay) {
		super();
		this.serialNumber = serialNumber;
		this.itemType = itemType;
		this.ratePerDay = ratePerDay;
	}



	public String getSerialNumber() {
		return serialNumber;
	}




	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}




	public int getRentDays() {
		return rentDays;
	}




	public void setRentDays(int rentDays) {
		this.rentDays = rentDays;
	}




	public int getNumberOfItems() {
		return numberOfItems;
	}




	public void setNumberOfItems(int numberOfItems) {
		this.numberOfItems = numberOfItems;
	}




	public void getItemDetails(){
		
		System.out.println("\nSerial Number : \t"+serialNumber);
		System.out.println("Item Type : \t\t"+itemType);
		System.out.println("Rate Per Day : \t\t"+ratePerDay);
	}
	

	public double calculateRent() {
		return rentDays * ratePerDay * numberOfItems;
	}
}
