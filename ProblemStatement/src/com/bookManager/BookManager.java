package com.bookManager;

import java.io.*;
import com.book.Book;


public class BookManager {

	
	public BookManager() {
		super();
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("finally")
	public String addBooks(Book[] bks){
		
		PrintWriter out = null;
		if(bks.length>0)
		{
			try {
				out = new PrintWriter(new FileWriter("bookDatabase.txt"));

				for(Book bookArrayElement : bks )
				{
					out.print(bookArrayElement.getBookName()+" , ");
					out.print(bookArrayElement.getAuthor()+" , ");
					out.print(bookArrayElement.getBookNumber()+" , ");
					out.println(bookArrayElement.getPrice());
				}
				
			}
		
			catch (IOException e) { }
			
			finally{
				out.close(); 
				return "Array Not Empty";
			}
		}
		
		else
			
			return "Empty Array";
	}
	
	public void printBooks(File filename){
		
		try { 
			FileReader fr = new FileReader("bookDatabase.txt");
			BufferedReader br = new BufferedReader(fr); 
			String line=null;
		
			try
		{ 
				while(( line=br.readLine()) !=null) 
				{ System.out.println(line); 
				} 
		} 
			catch (IOException e) 
			{ e.printStackTrace(); } 
		}	
		
		catch (FileNotFoundException e) 
		{ e.printStackTrace(); }
	}
}
