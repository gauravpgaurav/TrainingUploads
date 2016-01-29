package com.loan;

public class JewelLoan extends Loan{

	private float jewelGrams;

	
	
	public JewelLoan() {
		super();
		// TODO Auto-generated constructor stub
	}



	public JewelLoan(double loanAmount, float interestRate, String loanType, double totalAmount) {
		super(loanAmount, interestRate, loanType, totalAmount);
		// TODO Auto-generated constructor stub
	}



	public JewelLoan(String loanType, float jewelGrams) {
		super(loanType);
		this.jewelGrams = jewelGrams;

	}



	public void calculateLoan()
	{
		double totalAmount;
		double loanAmount = 2000 * jewelGrams;
		float interestRate;
	
		if (jewelGrams >= 100)
			interestRate = (float)11.0;
		else
			interestRate = (float)10.0;
				
		totalAmount = loanAmount + ( interestRate/100) * loanAmount;
		
		setLoanAmount(loanAmount);
		setInterestRate(interestRate);
		setTotalAmount(totalAmount);
	}
	

	
	
}
