package com.mediaLibrary.mediaTypes;

import com.mediaLibrary.Media;

public class DVD extends Media {

	private String dvdGenre;
	private double dvdRunningTime;

	public DVD(String mediaTitle, double mediaRating, int mediaLendingLength, String dvdGenre, double dvdRunningTime) {
		super(mediaTitle, mediaRating, mediaLendingLength);
		this.dvdGenre = dvdGenre;
		this.dvdRunningTime = dvdRunningTime;
	}

	@Override
	public void showDetails() {
		super.showDetails();
		System.out.println("Genre : \t\t" + dvdGenre);
		System.out.println("Running Time : \t\t" + dvdRunningTime + " Minutes\n\n");
	}

}
