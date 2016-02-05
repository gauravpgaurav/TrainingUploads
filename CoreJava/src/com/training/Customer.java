package com.training;

import com.training.myexceptions.RangeCheckException;

public class Customer {

	private int customerId;
	private String customerName;
	private String email_Id;
	private long handPhone;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Declare Rule
	public Customer(int customerId, String customerName, String email_Id, long handPhone) throws RangeCheckException {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.email_Id = email_Id;

		if (handPhone > 9999999999L || handPhone < 1111111111L) {
			try {
				throw new RangeCheckException(handPhone);
			} catch (RangeCheckException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		} else {
			this.handPhone = handPhone;
		}
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail_Id() {
		return email_Id;
	}

	public void setEmail_Id(String email_Id) {
		this.email_Id = email_Id;
	}

	public long getHandPhone() {
		return handPhone;
	}

	// Handle Rule
	public void setHandPhone(long handPhone) {

		if (handPhone > 9999999999L || handPhone < 1111111111L) {
			try {
				throw new RangeCheckException(handPhone);
			} catch (RangeCheckException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		} else {
			this.handPhone = handPhone;
		}

	}

	public String showCustomer() {

		String custDetails = customerId + " : " + customerName + " : " + email_Id + " : " + handPhone;

		return custDetails;

	}

}
