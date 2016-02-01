package com.mediaLibrary.mediaTypes;

import com.mediaLibrary.Media;

public class Periodical extends Media {
	
	private double periodicalVolNo;
	private String periodicalSubject;
	
	public Periodical(String mediaTitle, double mediaRating, int mediaLendingLength, double periodicalVolNo, String periodicalSubject) {
		super(mediaTitle, mediaRating, mediaLendingLength);
		this.periodicalVolNo = periodicalVolNo;
		this.periodicalSubject =periodicalSubject;
		
	}
	
	@Override
	public void showDetails(){
		super.showDetails();
		System.out.println("Volume Number : \t"+periodicalVolNo);
		System.out.println("Subject : \t\t"+periodicalSubject+"\n\n");
	}

}
