package com.tax;

public class TaxWhiz {
	
	double currentTaxRate;
	double salesTax;
	
	TaxWhiz(double currentTaxRate){
		
		this.currentTaxRate = currentTaxRate;
	}
	
	public double calcTax(double purchase){
	
		salesTax = currentTaxRate * purchase;
		return salesTax;
	}

}
