package com.solt.jdc;

public class Movie {
	private String title;
	private MovieType movieType;
	public Movie(String title, MovieType movieType) {
		super();
		this.title = title;
		this.movieType = movieType;
	}
	
	public MovieType getMovieType() {
		return movieType;
	}
	
	
}
