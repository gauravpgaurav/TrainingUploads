package com.mediaLibrary;

public class Media {

	private String mediaTitle;
	private double mediaRating;
	private int mediaLendingLength;

	public Media(String mediaTitle, double mediaRating, int mediaLendingLength) {
		super();
		this.mediaTitle = mediaTitle;
		this.mediaRating = mediaRating;
		this.mediaLendingLength = mediaLendingLength;
	}

	public void showDetails() {

		System.out.println("\nTitle : \t\t" + mediaTitle);
		System.out.println("Rating : \t\t" + mediaRating + " (Out of 5.0)");
		System.out.println("Lending Length : \t" + mediaLendingLength + " Days");
	}

}
