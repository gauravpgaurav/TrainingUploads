package com.bookManager;

import java.io.File;

import com.book.Book;

public class bookManagerApplication {

	public static void main(String[] args) {

		BookManager bookManagerIns = new BookManager();
		Book[] bookInsArray = new Book[3];
		bookInsArray[0] = new Book(101, "Java", "Schmidt", 500);
		bookInsArray[1] = new Book(102, "C++", "Mark", 250);
		bookInsArray[2] = new Book(103, "Python", "Abc", 700);

		File databaseFile = new File(bookManagerIns.addBooks(bookInsArray));
		bookManagerIns.printBooks(databaseFile);

	}

}
