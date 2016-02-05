package com.insurance;

public class Over_Riding_Application {

	public static void main(String[] args) {

		LifeInsurance ins1 = new LifeInsurance(101, "Ramesh", "QTR", 9000);
		LifeInsurance ins2 = new LifeInsurance(101, "Ramesh", "QTR", 9000);

		LifeInsurance ins3 = new LifeInsurance();
		String s = new String("123");
		// System.out.println(ins.toString());

		System.out.println(ins1.equals(ins2));
		System.out.println(ins1.equals(ins3));
		System.out.println(ins1.equals(s));
	}

}
