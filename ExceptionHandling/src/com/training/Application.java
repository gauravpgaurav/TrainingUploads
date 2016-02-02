package com.training;

public class Application {

	public static void main(String[] args){
		
		Converter obj = new Converter();
		double cel = obj.farenToCelsius(45.00);
		
		System.out.println("Celsius value of 45F : "+cel);
		
		Converter obj2 = new Converter();
		Double far2 = null;
		double cel2 = obj.farenToCelsius(far2);
		
		
		System.out.println("Celsius value of null : "+cel2);
	}
}
