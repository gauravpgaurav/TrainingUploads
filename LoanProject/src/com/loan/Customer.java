package com.loan;

public class Customer {

	private String customerName;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(String customerName) {
		super();
		this.customerName = customerName;
	}
	 public String displayCustomerDetails(){
		 return customerName;
	 }
	
}
