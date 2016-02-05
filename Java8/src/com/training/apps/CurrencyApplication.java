package com.training.apps;

import java.util.Scanner;
import com.training.ifaces.CurrencyConverter;

public class CurrencyApplication {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 45; i++)
			System.out.print("*");

		System.out.println();

		System.out.print("Enter Dollar Amount : \t");
		double dlrAmt = sc.nextDouble();

		System.out.print("\n\nINR Amount : \t");

		CurrencyConverter currencyConv = (double d) -> {
			return d * 67.62;
		};
		System.out.println(currencyConv.dollarToInr(dlrAmt));

		for (int i = 0; i < 45; i++)
			System.out.print("*");

		System.out.println();
	}
}
