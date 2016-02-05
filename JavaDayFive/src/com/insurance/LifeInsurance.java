package com.insurance;

public class LifeInsurance {

	private long policyNumber;
	private String policyHolderName;
	private String paymentMode;
	private double policyAmount;

	public double calculatePremium() {

		return policyAmount * (0.1);
	}

	public long getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(long policyNumber) {
		this.policyNumber = policyNumber;
	}

	public String getPolicyHolderName() {
		return policyHolderName;
	}

	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public double getPolicyAmount() {
		return policyAmount;
	}

	public void setPolicyAmount(double policyAmount) {
		this.policyAmount = policyAmount;
	}

	public LifeInsurance() {
		super();
		System.out.println("Blank Constructor Called");
	}

	public LifeInsurance(long policyNumber, String policyHolderName, String paymentMode, double policyAmount) {
		super();
		this.policyNumber = policyNumber;
		this.policyHolderName = policyHolderName;
		this.paymentMode = paymentMode;
		this.policyAmount = policyAmount;
	}

	// Static Block
	static {
		System.out.println("Static Block Called");
	}

	// Initialization Block
	{
		System.out.println("Initialization Block Called");
	}

	@Override
	public String toString() {

		return this.policyNumber + " : " + this.policyHolderName;
	}

	@Override
	public boolean equals(Object obj) {

		// Checking for Identity
		if (this == obj)
			return true;

		// Cautious
		if (obj == null)
			return false;

		// Checking the Type of Object
		if (this.getClass() != obj.getClass())
			return false;

		// Casting
		LifeInsurance ins = (LifeInsurance) obj;

		// Checking the Condition
		return ((policyNumber == ins.policyNumber) && (policyHolderName.equals(ins.policyHolderName)));
	}

	@Override
	public int hashCode() {

		long code = this.policyNumber + 7 * policyNumber;
		return (int) code;
	}

}
