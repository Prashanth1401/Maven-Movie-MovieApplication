package com.prashanth.service;

import java.util.List;
import java.util.Optional;

import com.prashanth.dto.Movie;

public interface MovieService {
	public Optional<Movie> addMovie(Movie movie);
	public Optional<Movie> updateMovieDetails(Movie movie);
	public Optional<Movie> getMovieById(Integer movieId);
	public List<Movie> getAllMovieList(Movie movie);
}
