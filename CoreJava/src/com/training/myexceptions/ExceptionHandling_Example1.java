package com.training.myexceptions;

public class ExceptionHandling_Example1 {
	
	public static void main(String[] args){
		
		String name=null;
		int len = 0;
		
		try{
			System.out.println(args[0]);
			System.out.println(name.length());
			//int len = name.length();
			len = name.length();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Enter Command Line Argument via Run Config-To !");
		}
		catch(NullPointerException e)
		{
			System.out.println("Check Attribute-Name It maybe Null !");
		}
		
		System.out.println(len);
	}

}
