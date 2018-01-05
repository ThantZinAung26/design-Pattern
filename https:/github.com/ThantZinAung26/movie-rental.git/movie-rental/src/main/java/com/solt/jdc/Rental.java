package com.solt.jdc;

public class Rental {
	private int numberOfDaysRented;
	private Movie movie;
	public Rental(int numberOfDaysRented, Movie movie) {
		super();
		this.numberOfDaysRented = numberOfDaysRented;
		this.movie = movie;
	}
	public int getNumberOfDaysRented() {
		return numberOfDaysRented;
	}
	public Movie getMovie() {
		return movie;
	}
	
/**	public int computeRentalCost() {
		int totalCost = 0;
		for (Rental rental : rentalList) {
			switch (rental.getMovie().getMovieType()) {
			case CHILD_MOVIES:
				if (rental.getNumberOfDaysRented() <= 7) {
					totalCost = rental.getNumberOfDaysRented() * 1;
				} else {
					totalCost = (rental.getNumberOfDaysRented() - 7) * 2 + 7;
				}
				break;
			case REGULAR_MOVIES:
				if (rental.getNumberOfDaysRented() <= 5) {
					totalCost = rental.getNumberOfDaysRented() * 2;
				} else {
					totalCost = (rental.getNumberOfDaysRented() - 5) * 3 + 10;
				}
				break;
			case NEW_RELEASE_MOVIES:
				if (rental.getNumberOfDaysRented() <= 3) {
					totalCost = rental.getNumberOfDaysRented() * 3;
				} else {
					totalCost = (rental.getNumberOfDaysRented() - 3) * 6 + 9;
				}
				break;

			}

		}
		return totalCost;
	}
*/	
	
}
