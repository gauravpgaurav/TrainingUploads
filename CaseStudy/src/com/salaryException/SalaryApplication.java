package com.salaryException;

import java.util.Scanner;

public class SalaryApplication {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int optionNumber;
		double inputSalary;
		String inputSkill_Level;
		
		Employee empIns;
		
	System.out.println("\n\n******** SALARY PORTAL ********");
	System.out.println("\n\tSelect Skill Level :-");
	System.out.println("\t1. Unskilled");
	System.out.println("\t2. Semi-Skilled");
	System.out.println("\t3. Skilled\n");
	System.out.print("Enter Option Number : ");
	
	optionNumber = sc.nextInt();
	
	switch(optionNumber)
	{
		case 1: inputSkill_Level = "Unskilled";
				break;
				
		case 2: inputSkill_Level = "Semi-Skilled";
				break;
			
		case 3: inputSkill_Level = "Skilled";
				break;
				
		default:
				inputSkill_Level = null;
				
	}
	
	System.out.print("\nEnter Salary Amount : ");
	inputSalary = sc.nextDouble();
	sc.close();
	
	if(optionNumber>=0 && optionNumber<=3)
			empIns = new Employee(inputSkill_Level, inputSalary);
			

	}
}
