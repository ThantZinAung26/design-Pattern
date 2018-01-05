package com.solt.jdc;

public class RentalForNewMovieRelease implements IMovieRental{
	
	public int computeRentalCost(int daysOfRented) {
		int totalCost = 0 ;
		if (daysOfRented <= 3) {
			totalCost = daysOfRented * 3;
		} else {
			totalCost = (daysOfRented - 3) * 6 + 9;
		}
		return totalCost;
	}

}
