package com.mediaLibrary.mediaTypes;

import com.mediaLibrary.Media;

public class Book extends Media {

	private String bookAuthor;
	private String bookSubject;
	private String isbn;

	public Book(String mediaTitle, double mediaRating, int mediaLendingLength, String bookAuthor, String bookSubject,
			String isbn) {
		super(mediaTitle, mediaRating, mediaLendingLength);
		this.bookAuthor = bookAuthor;
		this.bookSubject = bookSubject;
		this.isbn = isbn;
	}

	@Override
	public void showDetails() {
		super.showDetails();
		System.out.println("Auhtor : \t\t" + bookAuthor);
		System.out.println("Subject : \t\t" + bookSubject);
		System.out.println("ISBN : \t\t\t" + isbn + "\n\n");

	}

}
