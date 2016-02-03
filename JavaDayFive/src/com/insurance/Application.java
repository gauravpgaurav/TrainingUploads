package com.insurance;

import java.util.*;

public class Application {

	public static void main(String args[])
	{
		
		// Instance 1
		
		LifeInsurance insuranceObj1 = new LifeInsurance();
		System.out.println(insuranceObj1.calculatePremium());
		
		// Instance 2
		
		LifeInsurance insuranceObj2 = new LifeInsurance(101,"Gaurav","Cash",1500);		
		System.out.println(insuranceObj2.calculatePremium());
	
		// Instance 3
		
		Long policyNumber = Long.parseLong(args[0]);
		double policyAmount = Double.parseDouble(args[3]);
		LifeInsurance insuranceObj3 = new LifeInsurance(policyNumber,args[1],args[2],policyAmount);
		System.out.println(insuranceObj3.calculatePremium());
		
		// Instance 4
		
		String policyHolderName;
		String paymentMode;
		
		for (int i=0; i<45; i++)
			System.out.print("*");		
		System.out.println();
		
		// User Input
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Policy Number : \t\t");
		policyNumber = sc.nextLong();
		System.out.print("Enter Policy Holder Name : \t");
		policyHolderName = sc.next();
		System.out.print("Enter Payment Mode : \t\t");
		paymentMode = sc.next();
		System.out.print("Enter Policy Amount : \t\t");
		policyAmount = sc.nextDouble();
		sc.close();
		
		LifeInsurance insuranceObj4 = new LifeInsurance(policyNumber,policyHolderName,paymentMode,policyAmount);
		System.out.println(insuranceObj4.calculatePremium());
		
		
		// obj.calculate(double);
		
		for (int i=0; i<45; i++)
			System.out.print("*");
		System.out.println();
		
	}
}
