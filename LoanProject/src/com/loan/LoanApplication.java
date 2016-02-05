package com.loan;

import java.util.*;

public class LoanApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String tempCustomerName = new String();
		String tempLoanType = new String();
		double tempCustomerSalary;
		float tempJewelGram;
		int customerCount;

		System.out.println("\n******** Welcome to Bank Application ********\n\n");

		System.out.print("Enter Number of Customers :\t");
		customerCount = sc.nextInt();
		Customer[] customerList = new Customer[customerCount];

		PersonalLoan[] personalLoanList = new PersonalLoan[customerCount];
		JewelLoan[] jewelLoanList = new JewelLoan[customerCount];

		for (int i = 0; i < customerCount; i++) {
			System.out.println("\n\nEnter Details for Customer " + (i + 1) + " -\n");

			System.out.print("Enter Customer Name :\t\t");
			tempCustomerName = sc.next();
			System.out.print("Enter Loan Type :\t\t");
			tempLoanType = sc.next();
			customerList[i] = new Customer();
			customerList[i].setCustomerName(tempCustomerName);

			if (tempLoanType.equals("Personal")) {

				System.out.print("Enter Customer Salary :\t\t");
				tempCustomerSalary = sc.nextDouble();
				personalLoanList[i] = new PersonalLoan(tempLoanType, tempCustomerSalary);
				personalLoanList[i].calculateLoan();
				if (i == 0)
					System.out.println(" Customer Name \t Loan Type \t Interest Rate \t Loan Amount \t Total Amount\n");
				System.out.println(" Customer " + (i + 1) + " :-\t" + customerList[i].displayCustomerDetails()
						+ personalLoanList[i].displayLoanDetails());
			}

			else if (tempLoanType.equals("Jewel")) {
				System.out.print("Enter Weight of Jewels (in grams) :\t\t");
				tempJewelGram = sc.nextFloat();
				jewelLoanList[i] = new JewelLoan(tempLoanType, tempJewelGram);
				jewelLoanList[i].calculateLoan();
				if (i == 0)
					System.out.println(" Customer Name \t Loan Type \t Interest Rate \t Loan Amount \t Total Amount\n");
				System.out.println(" Customer " + (i + 1) + " :-\t" + customerList[i].displayCustomerDetails()
						+ jewelLoanList[i].displayLoanDetails());
			}

			else {
				System.out.println("\n\nERROR : Incorrect option !\n");
				break;
			}

		}

		sc.close();
	}
}
