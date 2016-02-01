package com.salaryException;



public class Employee {
	
	private String skill_Level;
	private double salary;
	private double minSalary;
	
	public Employee(String skill_Level, double salary) {
		super();
		this.skill_Level = skill_Level;
		
		switch(skill_Level)
		{
		case "Unskilled":	
							this.minSalary = 8500;
							break;
		case "Semi-Skilled":	
							this.minSalary = 9500;
							break;
		case "Skilled":		
							this.minSalary = 10500;
							break;
		}
		
		try {
			
				if(salary<minSalary)
								
						throw new MinimumSalarayException(salary,minSalary);
				else
					{
						this.salary = salary;
						showEmployeeDetails();
					}
								
			
		}
		catch (MinimumSalarayException e) {
			
			System.out.println(e.getMessage());
			}
		
	}
	
	public void showEmployeeDetails()
	{
		System.out.println("\nSkill Level : \t\t"+skill_Level);
		System.out.println("Salary : \t\t"+salary+"\n\n");
	}

}
