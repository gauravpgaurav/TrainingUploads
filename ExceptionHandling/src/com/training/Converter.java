package com.training;

public class Converter {

	public double farenToCelsius(Double faren) throws NullPointerException {

		double cel = 0.0;
		// try{
		cel = ((5.0 / 9.0) * (faren - 32.0));
		// }
		// catch(NullPointerException e)
		// {
		// System.out.println("Farenheit should not be null !");
		// System.out.println(e.getClass());
		// }
		return cel;
	}

}
