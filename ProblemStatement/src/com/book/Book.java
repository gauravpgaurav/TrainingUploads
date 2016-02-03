package com.book;

import java.io.Serializable;

public class Book implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 18L;
	private int bookNumber;
	private String bookName;
	private String author;
	private transient double price;
	
	
	public Book() {
		
		super();
		System.out.println("Book Initialized from Superclass");
	}
	
	public Book(int bookNumber, String bookName, String author, double price) {
		super();
		
		System.out.println("Book Initialized using Fields ");
		this.bookNumber = bookNumber;
		this.bookName = bookName;
		this.author = author;
		this.price = price;
	}

	public int getBookNumber() {
		return bookNumber;
	}
	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		
		return bookNumber + " : " + bookName + " : " + author + " : " + price ;
	}
	
	

	
}
