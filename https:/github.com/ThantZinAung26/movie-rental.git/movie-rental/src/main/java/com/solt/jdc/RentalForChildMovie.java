package com.solt.jdc;

public class RentalForChildMovie implements IMovieRental{
	public int computeRentalCost(int daysOfRented) {
		int totalCost = 0;
		if (daysOfRented <= 7) {
			totalCost = daysOfRented * 1;
		} else {
			totalCost = (daysOfRented - 7) * 2 + 7;
		}
		return totalCost;
	}
}
