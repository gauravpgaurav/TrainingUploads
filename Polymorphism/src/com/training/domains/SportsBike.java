package com.training.domains;

import com.training.ifaces.Automobileable;

public class SportsBike implements Automobileable {

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "Orange";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 100000;
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "R1";
	}

}
