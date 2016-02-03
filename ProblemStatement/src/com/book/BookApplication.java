package com.book;

import com.book.domains.BookSerializer;

public class BookApplication {
	
	public static void main(String[] args){
		
		Book bookIns =  new Book(101, "Java", "Schmidt", 500);
		Book bookIns2 = new Book();
		
		BookSerializer serializeIns = new BookSerializer();
		
		serializeIns.serialize(bookIns);
		
		bookIns2 = (Book)serializeIns.deSerialize();
		
		System.out.println(bookIns2.toString());
		
	}

}
