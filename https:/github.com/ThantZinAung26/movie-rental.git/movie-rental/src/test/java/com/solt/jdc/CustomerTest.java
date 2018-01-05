package com.solt.jdc;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class CustomerTest {
	private Customer customer;

	@Before
	public void init() {
		customer = new Customer();
	}

	@Test
	public void should_customer_have_rent_movie() throws Exception {

		customer.setName("Mg Mg");
		customer.getRentalList().add(new Rental(2, new Movie("Wonder Woman", MovieType.NEW_RELEASE_MOVIES)));
		customer.getRentalList().add(new Rental(1, new Movie("Super Man", MovieType.NEW_RELEASE_MOVIES)));
		assertThat(customer.getRentalList().size(), equalTo(2));
	}

	@Test
	public void should_compute_rental_cost_for_CHILDREN_movie_for_7_days() throws Exception {
		customer.setName("Min Min");
		customer.getRentalList().add(new Rental(7, new Movie("StarWar", MovieType.CHILD_MOVIES)));
		customer.setiMovieRental(new RentalForChildMovie());
		assertThat(customer.computeRentalCost(), equalTo(7));
	}

	@Test
	public void should_compute_rental_cost_for_CHILDREN_movie_for_9_days() throws Exception {
		customer.getRentalList().add(new Rental(10, new Movie("StarWar", MovieType.CHILD_MOVIES)));
		customer.setiMovieRental(new RentalForChildMovie());
		assertThat(customer.computeRentalCost(), equalTo(13));

	}

	@Test
	public void should_compute_rental_cost_for_regular_movie_for_5_days() throws Exception {
		customer.getRentalList().add(new Rental(5, new Movie("Spider Man", MovieType.REGULAR_MOVIES)));
		customer.setiMovieRental(new RentalForRegularMovie());
		assertThat(customer.computeRentalCost(), equalTo(10));
	}

	@Test
	public void should_compute_rental_cost_for_regular_movie_for_7_days() throws Exception {
		customer.getRentalList().add(new Rental(7, new Movie("Spider Man", MovieType.REGULAR_MOVIES)));
		customer.setiMovieRental(new RentalForRegularMovie());
		assertThat(customer.computeRentalCost(), equalTo(16));
	}

	@Test
	public void should_compute_rental_cost_for_New_Release_movie_for_3_days() throws Exception {
		customer.getRentalList().add(new Rental(3, new Movie("Justic", MovieType.NEW_RELEASE_MOVIES)));
		customer.setiMovieRental(new RentalForNewMovieRelease());
		assertThat(customer.computeRentalCost(), equalTo(9));
	}

	@Test
	public void should_compute_rental_cost_for_New_Release_movie_for_5_days() throws Exception {
		customer.getRentalList().add(new Rental(5, new Movie("Justic", MovieType.NEW_RELEASE_MOVIES)));
		customer.setiMovieRental(new RentalForNewMovieRelease());
		assertThat(customer.computeRentalCost(), equalTo(21));
	}

	@Test
	public void should_compute_rental_cost_for_New_Release_movie_for_6_days() throws Exception {
		customer.getRentalList().add(new Rental(6, new Movie("Justic", MovieType.NEW_RELEASE_MOVIES)));
		customer.setiMovieRental(new RentalForNewMovieRelease());
		assertThat(customer.computeRentalCost(), equalTo(27));
	}

}
