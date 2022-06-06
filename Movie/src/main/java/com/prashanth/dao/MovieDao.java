package com.prashanth.dao;

import java.util.List;
import java.util.Optional;

import com.prashanth.dto.Movie;

public interface MovieDao {

	public Optional<Movie> addMovie(Movie movie);
	public Optional<Movie> updateMovieDetails(Movie movie);
	public Optional<Movie> getMovieById(Integer movieId);
	public List<Movie> getAllMovieList(Movie movie);
	
}
