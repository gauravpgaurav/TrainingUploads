package com.tax;

public class TaxApplication {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		TaxWhiz taxWhizIns = new TaxWhiz(0.35);
		System.out.println("Sales Tax = Rs. " + taxWhizIns.calcTax(100));
	}

}
