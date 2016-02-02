package com.training;

public class Application {

	public static void main(String[] args){
		
		//Thread.currentThread().setName("No longer called Main");
		
		System.out.println(Thread.currentThread().getName());

		Thread obj = new MyThread();
		obj.setName("Printing Thread");
		obj.start();
	}
}
