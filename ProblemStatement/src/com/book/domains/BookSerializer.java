package com.book.domains;

import java.io.*;

import com.book.Book;

public class BookSerializer {

	public String serialize(Book obj) {

		ObjectOutputStream out = null;
		String message = null;

		try {
			out = new ObjectOutputStream(new FileOutputStream(new File("Book.ser")));
			out.writeObject(obj);

			message = "One Object Serialized - Press F5 to view File";
		}

		catch (IOException e) {

			e.getMessage();
		} finally {
			try {
				out.close();
			} catch (IOException e) {

				e.getMessage();
			}
		}
		return message;
	}

	public Object deSerialize() {

		Object obj = null;

		try (ObjectInputStream oin = new ObjectInputStream(new FileInputStream(new File("Book.ser")));) {
			obj = oin.readObject();
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		return obj;

	}
}
