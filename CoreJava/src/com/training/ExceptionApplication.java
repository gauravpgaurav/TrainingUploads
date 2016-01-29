package com.training;

import com.training.myexceptions.RangeCheckException;

public class ExceptionApplication {

	public static void main(String[] args){
		
		try {
			Customer cust1 = new Customer(118580,"ABC","abc@sapient.com",9740591222L);
			System.out.println("Customer 1 - "+cust1.showCustomer());
		} 
		
		catch (RangeCheckException e) {

			System.out.println(e.getMessage());
		}
		
		finally{
			System.out.println("\nReached Here !\n");
		}
		
		System.out.println("\nReached Bye !\n");
	}
}
