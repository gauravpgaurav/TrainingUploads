package com.training.myexceptions;

public class ExceptionHandling_Example1 {
	
	public static void main(String[] args){
		
		
		try{
			System.out.println(args[0]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Enter Command Line Argument via Run Config-To !");
		}
	}

}
