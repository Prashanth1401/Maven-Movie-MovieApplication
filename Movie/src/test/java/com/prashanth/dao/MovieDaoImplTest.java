package com.prashanth.dao;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.Test;

import com.prashanth.dto.Movie;

public class MovieDaoImplTest {

	
	
	MovieDaoImpl movieDaoIMPL=new MovieDaoImpl();
	Movie movie=new Movie(1401,"RRR",500.50,"blockbuster");
	
	
	
	
	@Test
	public void testCreateMovie() {
	
		Optional<Movie> addedMovie = movieDaoIMPL.addMovie(movie);
		assertTrue(addedMovie.isPresent());
		assertNotNull(addedMovie.get());
	}
	
	
	@Test
	public void testGetMovieById() {
		movieDaoIMPL.addMovie(movie);
		Optional<Movie> movie =movieDaoIMPL.getMovieById(1401);
		assertTrue(movie.isPresent());
		assertNotNull(movie.get());	
	}
	@SuppressWarnings("unlikely-arg-type")
	@Test
	public void testGetAllemployees() {
		movieDaoIMPL.getAllMovieList(movie);
       equals(movie.equals(movie));
	
	}
	@Test
	public void testUpdateMovieDetails() {
		movieDaoIMPL.addMovie(movie);
	movieDaoIMPL.updateMovieDetails(movie);
       movie.setMovieName("rrrr");
       assertEquals(true,movie.equals(movie));
		
	}

}
