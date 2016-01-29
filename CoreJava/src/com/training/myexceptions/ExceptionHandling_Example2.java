package com.training.myexceptions;

public class ExceptionHandling_Example2 {

	public static void main(String[] args){
	
		try{
		
			String age = "40";
			
			int age2 = Integer.parseInt(age);
			
			System.out.println(++age2);
			
		}
		
		catch(NumberFormatException | NullPointerException e){
			
			System.out.println(e.getMessage());
		}
	}
}
