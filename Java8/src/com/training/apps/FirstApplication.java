package com.training.apps;

import com.training.ifaces.Greeting;

public class FirstApplication {

	public static void main(String[] args) {

		Greeting grt = () -> {
			System.out.println("I got Java 8. What about you ?");
		};
		grt.show();
	}
}
