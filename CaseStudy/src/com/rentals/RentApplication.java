package com.rentals;

import com.rentals.rentItems.AirConditioner;
import com.rentals.rentItems.Fans;
import com.rentals.rentItems.Furniture;
import com.rentals.rentItems.Vessels;
import java.util.*;

public class RentApplication {
	
	public static void main(String[] args){
		
	ChennaiRentals[] rentObjArray = new ChennaiRentals[4];
	
	rentObjArray[0] = new Fans("FAN101", "Fan", 3);
	rentObjArray[1] = new AirConditioner("AC102", "AC", 3.5);
	rentObjArray[2] = new Furniture("FUR103", "Furniture", 7);
	rentObjArray[3] = new Vessels("VES104", "Vessels", "Stainless Steel");
	
	Scanner sc = new Scanner(System.in);
	String serialNumber;
	int flag=0;
	
	System.out.println();
	System.out.println("\n\n******** CHENNAI RENTALS ********");
	System.out.print("\n\nEnter Serial Number : ");
	serialNumber = sc.next();
	
	for(ChennaiRentals i : rentObjArray)
	{
		if(serialNumber.equals(i.getSerialNumber()))
		{
			i.getItemDetails();
			flag=1;
			break;
		}
	}	
		if(flag==0)
			
			System.out.println("\n\tERROR : No Item Found with Serial Number = "+serialNumber+" !!\n");
	
	}
}
