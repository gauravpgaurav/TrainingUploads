package com.training;

public class CustomerApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer cust1 = new Customer();
		
		cust1.setCustomerId(118579);
		cust1.setCustomerName("Gaurav Pant");
		cust1.setEmail_Id("gpant@sapient.com");
		cust1.setHandPhone(974059122);
	
		Customer cust2 = new Customer(118580,"ABC","abc@sapient.com",997160053);
		
		System.out.println("Customer 1 - "+cust1.showCustomer());
		
		System.out.println("Customer 2 - "+cust2.showCustomer());
		
		//GIT
	}

}
