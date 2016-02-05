package com.rentals;

import com.rentals.rentItems.AirConditioner;
import com.rentals.rentItems.Fan;
import com.rentals.rentItems.Furniture;
import com.rentals.rentItems.Vessels;
import java.util.*;

public class RentApplication {

	public static void main(String[] args) {

		RentalItems[] rentObjArray = new RentalItems[6];

		rentObjArray[0] = new Fan("FAN101", "Fan", 3, 120);
		rentObjArray[1] = new AirConditioner("AC102", "AC", 3.5, 700);
		rentObjArray[2] = new Fan("FAN102", "Fan", 4, 170);
		rentObjArray[3] = new Vessels("VES101", "Vessels", "Stainless Steel", 60);
		rentObjArray[4] = new Furniture("FUR103", "Furniture", "Chair", 130);
		rentObjArray[5] = new Vessels("VES104", "Vessels", "Ceramic", 120);

		Scanner sc = new Scanner(System.in);
		String serialNumber = "";
		int flag = 0;
		double totalAmount = 0, currentAmount = 0;

		System.out.println();
		System.out.println("\n******** CHENNAI RENTALS ********");

		printLine();

		while (!serialNumber.equals("Exit")) {
			currentAmount = 0;
			flag = 0;

			for (int j = 0; j <= 5; j++) {
				System.out.print("\t" + rentObjArray[j].getSerialNumber());
				if ((j + 1) % 3 == 0)
					System.out.println();
			}

			printLine();

			System.out.print("\nEnter Serial Number (Type 'Exit' to Exit) : ");
			serialNumber = sc.next();
			if (serialNumber.equals("Exit")) {
				System.out.print("\nExited ! \n\n******** Total Amount = Rs." + totalAmount + " ********");
				System.exit(0);
			}
			for (RentalItems i : rentObjArray) {
				if (serialNumber.equals(i.getSerialNumber())) {
					i.getItemDetails();
					flag = 1;

					currentAmount = i.calculateRent();
					totalAmount += currentAmount;

					printLine();

					System.out.println("\n\tCurrent Amount \t= Rs." + currentAmount);
					System.out.println("\tTotal Amount \t= Rs." + totalAmount);

					printLine();
				}
			}
			if (flag == 0) {
				System.out.println("\n\tERROR : No Item Found with Serial Number = " + serialNumber + " !!\n");
				printLine();
			}
		}
		sc.close();
	}

	public static void printLine() {
		System.out.println("\n");
		for (int j = 0; j < 50; j++)
			System.out.print("*");
		System.out.println();
	}

}
