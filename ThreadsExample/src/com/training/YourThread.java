package com.training;

public class YourThread implements Runnable {

	private double i;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub

		i=100;
		System.out.println(Thread.currentThread().getName());
		
		for(int j=0;j<=10;j++)
		{
			System.out.println(calculate());
		}
	}

	public double calculate(){
		
		//double i=100;
		return ++i;
		
	}
}
