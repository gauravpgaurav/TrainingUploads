package com.rentals;
import java.util.*;

abstract public class RentalItems {
	
	private String serialNumber;
	private String itemType;
	private int rentDays;
	private double ratePerDay;
	private int numberOfItems;
	
	
	public RentalItems(String serialNumber, String itemType, double ratePerDay) {
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

	public void setItemDetails()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Number of items : \t");
		int itemCount = sc.nextInt();
		setNumberOfItems(itemCount);
		System.out.print("Enter Number of Days  : \t");
		int numberofDays = sc.nextInt();
		setRentDays(numberofDays);
		
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
