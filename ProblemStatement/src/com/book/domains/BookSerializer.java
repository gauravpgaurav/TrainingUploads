package com.book.domains;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.book.Book;

public class BookSerializer {

	public String serialize(Book obj){
		
		ObjectOutputStream out =null;
		String message = null;
		
		try {
			 out = new ObjectOutputStream(new FileOutputStream(new File("Book.ser")));
		} 

		catch (IOException e) {

				e.getMessage();
		}
		finally{
			try {
				out.close();
			} 
			catch (IOException e) {

				e.getMessage();
			}
		}
		return message;
	}
	
	public Object deSerialize(){
		
		Object obj = null;
		return obj;
		
	}
}
