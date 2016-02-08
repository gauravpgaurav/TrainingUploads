package com.training.domain;

public class Manager extends Employee {

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manager(String employeeId, String employeeName, String employeeDesignation, double employeeSalary) {
		super(employeeId, employeeName, employeeDesignation, employeeSalary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Manager [EmployeeId =" + getEmployeeId() + ", EmployeeName =" + getEmployeeName()
				+ ", EmployeeDesignation =" + getEmployeeDesignation() + ", EmployeeSalary ="
				+ getEmployeeSalary() + "]";
	}

	
}
