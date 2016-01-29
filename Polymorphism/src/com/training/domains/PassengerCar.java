package com.training.domains;

import com.training.ifaces.Automobileable;

public class PassengerCar implements Automobileable {

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "White";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 500000;
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "Jazz";
	}

}
