package com.training.apps;
import java.util.*;

import com.training.domains.NewShowRoom;
import com.training.ifaces.Automobileable;

public class Application {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int key =0;
		Automobileable polyAuto = null;
		//ShowRoom showRoomIns = new ShowRoom();
		NewShowRoom newShowRoomIns = new NewShowRoom();
		
		while(key!=5)
		{
			System.out.println("\n ******** ShowRoom App ******** ");
			System.out.println("\t 1. Passenger Car ");
			System.out.println("\t 2. Luxury Car ");
			System.out.println("\t 3. Sport Car ");
			System.out.println("\t 4. Sport Bike ");
			System.out.println("\t 5. Exit ");
			System.out.print("\n Enter Key : \t");
			key = sc.nextInt();
		
			if((key<1)||(key>5))
				{
					System.out.println("\t ERROR : Incorrect Input ! ");
					continue;
				}
			
			else if(key==5)
			{
				System.out.println("\t Exited ! ");
				break;
			}
			
			else 
			{
				polyAuto = newShowRoomIns.getItem(key);
				newShowRoomIns.printQuote(polyAuto);	
			}
		
			
			
		}
		
		sc.close();
	}
}
