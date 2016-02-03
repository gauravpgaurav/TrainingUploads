package com.insurance;

public class InsuranceManagerApplication {

	public static void main(String[] args){
		
		LifeInsurance ins1 = new LifeInsurance(101, "Ramesh", "QTR", 450000);
		LifeInsurance ins2 = new LifeInsurance(102, "Rajesh", "HLF", 550000);
		LifeInsurance ins3 = new LifeInsurance(104, "Rakesh", "ANN", 650000);
		LifeInsurance ins4 = new LifeInsurance(103, "Rangesh", "QTR", 750000);
	
		LifeInsurance[] insArray = {ins1, ins2, ins3, ins4};
		
//		InsuranceManager mangIns = new InsuranceManager();
//		mangIns.printPremiums(insArray);
		
		// For Static 
		
		InsuranceManager.printPremiums(insArray);
		
	}
}
