package com.salaryException;

public class MinimumSalarayException extends Exception {

	private double salary;
	private double minSalary;

	// Mandatory Dependency
	public MinimumSalarayException(double salary, double minSalary) {
		super();
		this.salary = salary;
		this.minSalary = minSalary;
	}

	// Overriding Super Class Method
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "\t" + salary + " is Below Minimum Wage Criteria (ie. Rs." + minSalary + ") !";
	}
}
