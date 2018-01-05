package com.solt.jdc;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private String name;
	private List<Rental> rentalList = new ArrayList<>();
	private IMovieRental iMovieRental;

	public void setiMovieRental(IMovieRental iMovieRental) {
		this.iMovieRental = iMovieRental;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Rental> getRentalList() {
		return rentalList;
	}

	public void setRentalList(List<Rental> rentalList) {
		this.rentalList = rentalList;
	}

	public int computeRentalCost() {
		for (Rental rental : rentalList) {

			return iMovieRental.computeRentalCost(rental.getNumberOfDaysRented());

		}
		return 0;

	}

}
