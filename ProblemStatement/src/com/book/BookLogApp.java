package com.book;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import com.book.domains.BookSerializer;

public class BookLogApp {

	public static void main(String[] args) {
		
		//Apache Log4j Example
		Logger log = Logger.getLogger("MyFirstLog");
		BasicConfigurator.configure();
		log.info("Main Method Called");

		Book bookIns = new Book(101, "Java", "Schmidt", 500);
		Book bookIns2 = new Book();

		BookSerializer serializeIns = new BookSerializer();

		String message = serializeIns.serialize(bookIns);
		log.info("Book Serialized");

		if (message != null) {
			System.out.println(message);
			bookIns2 = (Book) serializeIns.deSerialize();
			System.out.println(bookIns2.toString());
			log.info("Book DeSerialized");
		}

		else
			System.out.println(message);
		
		log.info("Exit Bye");

	}

}
