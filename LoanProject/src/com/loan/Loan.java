package com.loan;

public class Loan {

	private double loanAmount;
	private float interestRate;
	private String loanType;
	private double totalAmount;

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public float getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Loan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Loan(double loanAmount, float interestRate, String loanType, double totalAmount) {
		super();
		this.loanAmount = loanAmount;
		this.interestRate = interestRate;
		this.loanType = loanType;
		this.totalAmount = totalAmount;
	}

	public Loan(String loanType) {
		super();
		this.loanType = loanType;
	}

	public String displayLoanDetails() {
		return (" : " + loanType + " : " + interestRate + " : " + loanAmount + " : " + totalAmount + "  ");
	}

}
