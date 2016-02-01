package com.mediaLibrary;

import com.mediaLibrary.mediaTypes.Book;
import com.mediaLibrary.mediaTypes.DVD;
import com.mediaLibrary.mediaTypes.Periodical;
import java.util.*;

public class MediaApplication {
	
	public static void main(String[] args){
		
		Media[] mediaInsArray = new Media[4];
		mediaInsArray[0] = new Book("Eragon", 3.8, 14, "Elliot", "Fiction", "11003443");
		mediaInsArray[1] = new Book("Steve Jobs", 4.8, 14, "Issac", "Biography", "11012312");
		mediaInsArray[2] = new Periodical("Readers Digest", 4.0, 7, 16.2, "Lifestyle");
		mediaInsArray[3] = new DVD("Interstellar", 5.0, 21, "Sci-Fi", 148);
		Scanner sc = new Scanner(System.in);
		int optionNumber;
		
		System.out.println("\n\n******** MEDIA LIBRARY ********");
		System.out.println("\n\tDisplay details of :-");
		System.out.println("\t1. Books");
		System.out.println("\t2. Periodicals");
		System.out.println("\t3. DVDs\n");
		System.out.print("Enter Option Number : ");
		
		optionNumber = sc.nextInt();
		
		switch(optionNumber)
		{
		case 1:
			mediaInsArray[0].showDetails();
			mediaInsArray[1].showDetails();
			break;
		case 2:
			mediaInsArray[2].showDetails();
			break;
		case 3:
			mediaInsArray[3].showDetails();
			break;
		default:
			System.out.println("\n\tERROR : Incorrect Input !!\n");
			break;
		}
		
		sc.close();
	}

}
