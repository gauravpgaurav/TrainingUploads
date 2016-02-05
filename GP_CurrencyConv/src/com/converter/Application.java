package com.converter;

import java.util.*;

public class Application {

	static CurrencyConverter convObj;
	static Scanner sc;
	static Double dlrAmt;

	public static void main(String Args[]) {
		convObj = new CurrencyConverter();
		sc = new Scanner(System.in);

		for (int i = 0; i < 45; i++)
			System.out.print("*");

		System.out.println();

		System.out.print("Enter Dollar Amount : \t");
		dlrAmt = sc.nextDouble();

		System.out.println("\n\nINR Amount : \t" + convObj.dollarToInr(dlrAmt));
		for (int i = 0; i < 45; i++)
			System.out.print("*");

		System.out.println();
	}
}
