package com.training;

public class UsePrintString implements Runnable {

	private String str1, str2;

	public UsePrintString(String str1, String str2) {
		super();
		this.str1 = str1;
		this.str2 = str2;

		Thread t = new Thread(this);
		// this refers to current instance which is Runnable

		t.start();

	}

	@Override
	public void run() {

		PrintString.print(str1, str2);
	}

}
