package com.training;

import java.io.*;

public class File_Example {

	public static void main(String[] args) {

		File f = new File("Sample.txt");

		try {
			f.createNewFile();
		}

		catch (IOException e) {
			System.out.println(e.getMessage());
		}

		PrintWriter writer = null;

		try {
			writer = new PrintWriter(f);
			writer.print("Hello");
			writer.close();
		}

		catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}

		System.out.println(f.exists());

	}
}
