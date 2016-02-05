package com.loan;

public class PersonalLoan extends Loan {

	private double customerSalary;

	public PersonalLoan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PersonalLoan(double customerSalary, double loanAmount, float interestRate, String loanType,
			double totalAmount) {

		super(loanAmount, interestRate, loanType, totalAmount);
		this.customerSalary = customerSalary;

		// TODO Auto-generated constructor stub
	}

	public PersonalLoan(String loanType, double customerSalary) {
		super(loanType);
		this.customerSalary = customerSalary;

	}

	public void calculateLoan() {
		double totalAmount;
		double loanAmount = 12 * customerSalary;
		float interestRate;

		if (customerSalary >= 50000)
			interestRate = (float) 14.0;
		else
			interestRate = (float) 13.0;

		totalAmount = loanAmount + (interestRate / 100) * loanAmount;

		setLoanAmount(loanAmount);
		setInterestRate(interestRate);
		setTotalAmount(totalAmount);
	}

}
