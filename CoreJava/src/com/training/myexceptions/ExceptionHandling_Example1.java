package com.training.myexceptions;

public class ExceptionHandling_Example1 {
	
	public static void main(String[] args){
		
		String name=null;
		
		try{
			System.out.println(args[0]);
			System.out.println(name.length());
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Enter Command Line Argument via Run Config-To !");
		}
		catch(NullPointerException e)
		{
			System.out.println("Check Attribute-Name It mayve Null !");
		}
	}

}
