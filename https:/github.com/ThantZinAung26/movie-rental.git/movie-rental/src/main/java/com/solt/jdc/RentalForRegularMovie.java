package com.solt.jdc;

public class RentalForRegularMovie implements IMovieRental{
	
	public int computeRentalCost(int daysOfRented) {
		int totalCost = 0 ;
		if (daysOfRented <= 5) {
			totalCost = daysOfRented * 2;
		} else {
			totalCost = (daysOfRented - 5) * 3 + 10;
		}
		return totalCost;
	}

}
